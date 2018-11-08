package com.ideas.RevenueManagementForum;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by idnklm on 3/4/2018.
 */
@Document(collection = "events")
public class RevenueForumEvent {
    @Id
    private String eventId;
    private String title;
    private String description;
    private Address address;
    private List<Speaker> speakers;
    private List<Participant> participants;
    private String startDateTime;
    private String endDateTime;
    private Material material;

    protected RevenueForumEvent() {

    }

    public RevenueForumEvent(String title, String description, Address address, List<Speaker> speakers, List<Participant> participants, String startDateTime, String endDateTime, Material material) {
        this.title = title;
        this.description = description;
        this.address = address;
        this.speakers = speakers;
        this.participants = participants;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.material = material;
    }


    public RevenueForumEvent(String title, String description, Address address, List<Speaker> speakers,String startDateTime, String endDateTime){
        this.title=title;
        this.description=description;
        this.address=address;
        this.speakers=speakers;
        this.startDateTime=startDateTime;
        this.endDateTime=endDateTime;
    }


    public String getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        description = description;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RevenueForumEvent)) return false;

        RevenueForumEvent that = (RevenueForumEvent) o;

        if (getEventId() != null ? !getEventId().equals(that.getEventId()) : that.getEventId() != null) return false;
        if (getTitle() != null ? !getTitle().equals(that.getTitle()) : that.getTitle() != null) return false;
        if (getDescription() != null ? !getDescription().equals(that.getDescription()) : that.getDescription() != null)
            return false;
        if (getAddress() != null ? !getAddress().equals(that.getAddress()) : that.getAddress() != null) return false;
        if (getSpeakers() != null ? !getSpeakers().equals(that.getSpeakers()) : that.getSpeakers() != null)
            return false;
        if (getParticipants() != null ? !getParticipants().equals(that.getParticipants()) : that.getParticipants() != null)
            return false;
        if (getStartDateTime() != null ? !getStartDateTime().equals(that.getStartDateTime()) : that.getStartDateTime() != null)
            return false;
        if (getEndDateTime() != null ? !getEndDateTime().equals(that.getEndDateTime()) : that.getEndDateTime() != null)
            return false;
        return getMaterial() != null ? getMaterial().equals(that.getMaterial()) : that.getMaterial() == null;
    }

    @Override
    public int hashCode() {
        int result = getEventId() != null ? getEventId().hashCode() : 0;
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        result = 31 * result + (getAddress() != null ? getAddress().hashCode() : 0);
        result = 31 * result + (getSpeakers() != null ? getSpeakers().hashCode() : 0);
        result = 31 * result + (getParticipants() != null ? getParticipants().hashCode() : 0);
        result = 31 * result + (getStartDateTime() != null ? getStartDateTime().hashCode() : 0);
        result = 31 * result + (getEndDateTime() != null ? getEndDateTime().hashCode() : 0);
        result = 31 * result + (getMaterial() != null ? getMaterial().hashCode() : 0);
        return result;
    }
}


