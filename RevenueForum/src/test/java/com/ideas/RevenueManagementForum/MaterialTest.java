package com.ideas.RevenueManagementForum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by idnklm on 3/7/2018.
 */
public class MaterialTest {

    Material material;

    private static final String revenueForum2018PptSlides="revenueForum2018PptSlides.ppt";
    private static final String revenueForum2018YoutubeVideoLink="www.youtube.com/revenueForum2018";
    private static final String revenueForum2018PdfAttachment="revenueForum2018.pdf";

    @Before
    public void setUp(){
        material=new Material();
    }

    @Test
    public void constructorShouldSetPathToSlidesLinkToVideoPathToAttachment(){
        material=new Material(revenueForum2018PptSlides,revenueForum2018YoutubeVideoLink,revenueForum2018PdfAttachment);
        assertTrue(material.getPathToSlides().equals(revenueForum2018PptSlides));
        assertTrue(material.getPathToAttachment().equals(revenueForum2018PdfAttachment));
        assertTrue(material.getLinkToVideo().equals(revenueForum2018YoutubeVideoLink));
    }

    @Test
    public void shouldSetPathToSlides(){
        setUp();
        material.setPathToSlides(revenueForum2018PptSlides);
        assertTrue(material.getPathToSlides().equals(revenueForum2018PptSlides));
    }

    @Test
    public void shouldSetLinkToVideo(){
        setUp();
        material.setLinkToVideo(revenueForum2018YoutubeVideoLink);
        assertTrue(material.getLinkToVideo().equals(revenueForum2018YoutubeVideoLink));
    }


    @Test
    public void shouldSetPathToAttachment(){
        setUp();
        material.setPathToAttachment(revenueForum2018PdfAttachment);
        assertTrue(material.getPathToAttachment().equals(revenueForum2018PdfAttachment));
    }
}
