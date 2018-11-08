package com.ideas.RevenueManagementForum;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by idnklm on 3/7/2018.
 */
public class RevenueForumEventTest {
    private static  final String EVENTID="987quxd";
    private static final String REVENUE_FORUM_2018_TITLE="Revenue Forum 2018";
    private static final String REVENUE_FORUM_2018_DESCRIPTION="Revenue Forum 2018";
    private static final Address RM2018_address=new Address();


    RevenueForumEvent revenueForumEvent;

    @Before
    public void setUp(){
        RevenueForumEvent revenueForumEvent=new RevenueForumEvent();
    }

    //@Test
    public void shouldSetEventId(){
        setUp();
        revenueForumEvent.setEventId(EVENTID);
        assertTrue(revenueForumEvent.getEventId().equals(EVENTID));
    }
}
