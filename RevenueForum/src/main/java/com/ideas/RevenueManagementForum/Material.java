package com.ideas.RevenueManagementForum;

/**
 * Created by idnklm on 3/4/2018.
 */

public class Material {
    private String pathToSlides;
    private String linkToVideo;
    private String pathToAttachment;

    protected Material(){

    }

    public Material(String pathToSlides, String linkToVideo, String pathToAttachment) {
        this.pathToSlides = pathToSlides;
        this.linkToVideo = linkToVideo;
        this.pathToAttachment = pathToAttachment;
    }



    public String getPathToSlides() {
        return pathToSlides;
    }

    public void setPathToSlides(String pathToSlides) {
        this.pathToSlides = pathToSlides;
    }

    public String getLinkToVideo() {
        return linkToVideo;
    }

    public void setLinkToVideo(String linkToVideo) {
        this.linkToVideo = linkToVideo;

    }

    public String getPathToAttachment() {
        return pathToAttachment;
    }

    public void setPathToAttachment(String pathToAttachment) {
        this.pathToAttachment = pathToAttachment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Material)) return false;

        Material material = (Material) o;

        if (getPathToSlides() != null ? !getPathToSlides().equals(material.getPathToSlides()) : material.getPathToSlides() != null)
            return false;
        if (getLinkToVideo() != null ? !getLinkToVideo().equals(material.getLinkToVideo()) : material.getLinkToVideo() != null)
            return false;
        return getPathToAttachment() != null ? getPathToAttachment().equals(material.getPathToAttachment()) : material.getPathToAttachment() == null;
    }

    @Override
    public int hashCode() {
        int result = getPathToSlides() != null ? getPathToSlides().hashCode() : 0;
        result = 31 * result + (getLinkToVideo() != null ? getLinkToVideo().hashCode() : 0);
        result = 31 * result + (getPathToAttachment() != null ? getPathToAttachment().hashCode() : 0);
        return result;
    }
}
