package com.ideas.RevenueManagementForum;

import com.mongodb.gridfs.GridFSDBFile;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by idnklm on 3/7/2018.
 */
public class SpeakerTest {

    Speaker speaker;
    private static final String ANKUR_BADHWAR="Ankur Badhwar";
    private static final String REVENUE_MANAGER="Revenue Manager";
    private static final String CONRAD_PUNE="Conrad, Pune";
    private static final String AnkurBadhwarLinkedinProfile="in.linkedin.com/in/Ankur-Badhwar";
    private static final String AnkurBadhwarPathToImage="/AnkurBadhwar.png";

    @Before
    public void setUp(){
        speaker=new Speaker();
    }

    @Test
    public void constructorShouldSetSpeakerAttributes(){
        speaker=new Speaker(ANKUR_BADHWAR,REVENUE_MANAGER,CONRAD_PUNE,AnkurBadhwarLinkedinProfile/*,AnkurBadhwarPathToImage*/);
        assertTrue(speaker.getName().equals(ANKUR_BADHWAR));
        assertTrue(speaker.getPosition().equals(REVENUE_MANAGER));
        assertTrue(speaker.getOrganization().equals(CONRAD_PUNE));
        assertTrue(speaker.getLinkToLinkedInProfile().equals(AnkurBadhwarLinkedinProfile));
    }

    @Test
    public void shouldSetName(){
        setUp();
        speaker.setName(ANKUR_BADHWAR);
        assertTrue(speaker.getName().equals(ANKUR_BADHWAR));
    }

    @Test
    public void shouldSetPosition(){
        setUp();
        speaker.setPosition(REVENUE_MANAGER);
        assertTrue(speaker.getPosition().equals(REVENUE_MANAGER));
    }

    @Test
    public void shouldSetOrganization(){
        setUp();
        speaker.setOrganization(CONRAD_PUNE);
        assertTrue(speaker.getOrganization().equals(CONRAD_PUNE));
    }

    @Test
    public void shouldSetLinkToLinkedInProfile(){
        setUp();
        speaker.setLinkToLinkedInProfile(AnkurBadhwarLinkedinProfile);
        assertTrue(speaker.getLinkToLinkedInProfile().equals(AnkurBadhwarLinkedinProfile));
    }

    @Test
    public void shouldSetPathToImage(){
        setUp();
        speaker.setPathToImage(AnkurBadhwarPathToImage);
        assertTrue(speaker.getPathToImage().equals(AnkurBadhwarPathToImage));
    }





}
