package com.ideas.RevenueManagementForum;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.gridfs.GridFSBucket;
import com.mongodb.client.gridfs.GridFSBuckets;
import com.mongodb.client.gridfs.model.GridFSFile;
import com.mongodb.client.gridfs.model.GridFSUploadOptions;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import javax.annotation.Resource;
import java.io.*;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static com.mongodb.client.model.Filters.eq;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.ROOT;

/**
 * Created by idnklm on 3/5/2018.
 */

/*172.26.121.224*/
@CrossOrigin(origins = "*")
@RestController
public class RevenueForumEventController {

    @Autowired
    private RevenueForumEventService revenueForumEventService;

    @Autowired
    private NotificationService notificationService;

    public RevenueForumEventController(RevenueForumEventService revenueForumEventService) {
        this.revenueForumEventService = revenueForumEventService;
    }

    @GetMapping("/")
    public String sayWelcome() {
        return "Welcome to Revenue Management Forum API";
    }

    @GetMapping("/revenueForumEvents")
    public List<RevenueForumEvent> getAllRevenueForumEvents() {
        return revenueForumEventService.getAllRevenueForumEvents();
    }


    @PostMapping("/revenueForumEvents")
    public void addRevenueForumEvent(@RequestBody RevenueForumEvent revenueForumEvent) {
        revenueForumEventService.addRevenueForumEvent(revenueForumEvent);

    }

    @GetMapping("/revenueForumEvents/{eventId}")
    public RevenueForumEvent findByEventId(@PathVariable("eventId") String eventId){
        return revenueForumEventService.findByEventId(eventId);
    }

    @PutMapping("/revenueForumEvents/addParticipant/{eventId}")
    public void updateRevenueForumEventParticipants(@PathVariable("eventId") String eventId, @RequestBody Participant addedParticipant){
        RevenueForumEvent revenueForumEventToBeUpdated=revenueForumEventService.findByEventId(eventId);
        if(revenueForumEventToBeUpdated.getParticipants()==null) {
            ArrayList<Participant> participants=new ArrayList<>();
            revenueForumEventToBeUpdated.setParticipants(participants);
            participants.add(addedParticipant);
        }else {
            revenueForumEventToBeUpdated.getParticipants().add(addedParticipant);
        }
        revenueForumEventService.updateRevenueForumEvent(revenueForumEventToBeUpdated);
        notificationService.sendNotificationTo(addedParticipant);
        notificationService.sendParticipantDetailsToAdmins(revenueForumEventToBeUpdated);

    }

    @DeleteMapping("/revenueForumEvents/{eventId}")
    public void deleteRevenueForumEvent(@PathVariable("eventId") String eventId){
        RevenueForumEvent revenueForumEventToBeDeleted= revenueForumEventService.findByEventId(eventId);
        revenueForumEventService.deleteRevenueForumEvent(revenueForumEventToBeDeleted);
    }

    @DeleteMapping("/revenueForumEvents")
    public void deleteAllRevenueForumEvents(){
        revenueForumEventService.deleteAllRevenueForumEvents();

    }

    @GetMapping("/revenueForumEvents/upcoming")
    public List<RevenueForumEvent> getUpcomingEvents() {
        return revenueForumEventService.getUpComingEvents();

    }

    @GetMapping("/revenueForumEvents/past")
    public List<RevenueForumEvent> getPastEvents() {
        return revenueForumEventService.getPastEvents();
    }

    @GetMapping("revenueForumEvents/speaker/{speakerFileName}")
    public ResponseEntity<InputStreamResource> getImage(@PathVariable("speakerFileName") String speakerFileName) throws IOException{
        ClassPathResource imageFile= new ClassPathResource("RevenueForum_Speaker_Images/"+speakerFileName+".jpg");
        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(new InputStreamResource(imageFile.getInputStream()));

    }

}
