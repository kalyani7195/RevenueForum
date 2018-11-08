package com.ideas.RevenueManagementForum;


import com.mongodb.Block;
import com.mongodb.gridfs.GridFSDBFile;

/**
 * Created by idnklm on 3/4/2018.
 */

public class Speaker {
    private String name;
    private String position;
    private String organization;
    private String linkToLinkedInProfile;
    private String pathToImage;

    protected Speaker() {

    }

    public Speaker(String name, String position, String organization, String linkToLinkedInProfile/*, String pathToImage*//*, GridFSDBFile photo*/) {
        this.name = name;
        this.position = position;
        this.organization = organization;
        this.linkToLinkedInProfile = linkToLinkedInProfile;

    }

    public Speaker(String name, String position, String organization, String linkToLinkedInProfile, String pathToImage) {
        this.name = name;
        this.position = position;
        this.organization = organization;
        this.linkToLinkedInProfile = linkToLinkedInProfile;
        this.pathToImage = pathToImage;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPathToImage() {
        return pathToImage;
    }

    public void setPathToImage(String pathToImage) {
        this.pathToImage = pathToImage;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getLinkToLinkedInProfile() {

        return linkToLinkedInProfile;
    }

    public void setLinkToLinkedInProfile(String linkToLinkedInProfile) {
        this.linkToLinkedInProfile = linkToLinkedInProfile;
    }
}
