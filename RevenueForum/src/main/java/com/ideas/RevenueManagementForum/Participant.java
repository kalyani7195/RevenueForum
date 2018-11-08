package com.ideas.RevenueManagementForum;


/**
 * Created by idnklm on 3/4/2018.
 */

public class Participant {
    private String name;
    private String emailId;
    private String organization;

    protected  Participant(){

    }

    public Participant(String name, String emailId, String organization) {

        this.name = name;
        this.emailId = emailId;
        this.organization = organization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getOrganization() {
        return organization;
    }


    public void setOrganization(String organization) {
        this.organization = organization;
    }

    
}
