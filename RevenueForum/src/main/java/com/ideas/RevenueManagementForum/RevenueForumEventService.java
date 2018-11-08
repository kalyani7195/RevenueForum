package com.ideas.RevenueManagementForum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by idnklm on 3/6/2018.
 */

@Service
public class RevenueForumEventService {

    @Autowired
    private RevenueForumEventRepository revenueForumEventRepository;

    public List<RevenueForumEvent> getAllRevenueForumEvents(){
        List<RevenueForumEvent> revenueForumEvents=new ArrayList<>();
        revenueForumEventRepository.findAll().forEach(revenueForumEvents::add);
        return  revenueForumEvents;
    }

    public void addRevenueForumEvent(RevenueForumEvent revenueForumEvent){
         revenueForumEventRepository.insert(revenueForumEvent);
    }

    public List<RevenueForumEvent> getUpComingEvents() {
        return revenueForumEventRepository.findAll().stream().filter(isUpcomingEvent()).sorted(byStartDateTimeInDescendingOrder).collect(Collectors.toList());
    }
    public List<RevenueForumEvent> getPastEvents(){
        return revenueForumEventRepository.findAll().stream().filter(isPastEvent()).sorted(byStartDateTimeInDescendingOrder).collect(Collectors.toList());
    }

    public RevenueForumEvent findByEventId(String eventId){
        return revenueForumEventRepository.findByEventId(eventId);
    }

    public void deleteRevenueForumEvent(RevenueForumEvent revenueForumEvent){
        revenueForumEventRepository.delete(revenueForumEvent);
    }

    public void updateRevenueForumEvent(RevenueForumEvent revenueForumEvent){
        revenueForumEventRepository.save(revenueForumEvent);
    }

    public void deleteAllRevenueForumEvents(){
        revenueForumEventRepository.deleteAll();
    }

    private Predicate<RevenueForumEvent> isUpcomingEvent() {
        return (p-> LocalDateTime.parse(p.getStartDateTime()).isAfter(LocalDateTime.now()));
    }

    private Predicate<RevenueForumEvent> isPastEvent(){
        return(p->LocalDateTime.parse(p.getEndDateTime()).isBefore(LocalDateTime.now()));
    }

    Comparator<RevenueForumEvent> byStartDateTimeInDescendingOrder = new Comparator<RevenueForumEvent>() {
        @Override
        public int compare(RevenueForumEvent firstEvent, RevenueForumEvent secondEvent) {
            if(LocalDateTime.parse(firstEvent.getStartDateTime()).isBefore(LocalDateTime.parse(secondEvent.getStartDateTime()))){
                return 1;
            }
            else{
                return -1;
            }
        }
    };
}
