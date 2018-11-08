package com.ideas.RevenueManagementForum;

import com.ideas.RevenueManagementForum.Participant;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by idnklm on 3/7/2018.
 */
public class ParticipantTest {

        private static final String KALYANI= "Kalyani";
        private static final String Kalyani7195AtGmailDotCom="kalyani7195@gmail.com";
        private static final String IDeaS ="IDeas A SAS Company";

        Participant participant;

        @Before
        public void setUp(){
            participant=new Participant();
        }


        @Test
        public void constructorShouldSetNameEmailIdOrganization(){
            participant=new Participant(KALYANI,Kalyani7195AtGmailDotCom,IDeaS);
            assertTrue(participant.getName().equals(KALYANI));
            assertTrue(participant.getEmailId().equals(Kalyani7195AtGmailDotCom));
            assertTrue(participant.getOrganization().equals(IDeaS));
        }


        @Test
        public void shouldSetName() {
            setUp();
            participant.setName(KALYANI);
            assertTrue(participant.getName().equals(KALYANI));
        }

        @Test
        public void shouldSetEmailId(){
            setUp();
            participant.setEmailId(Kalyani7195AtGmailDotCom);
            assertTrue(participant.getEmailId().equals(Kalyani7195AtGmailDotCom));
        }

        @Test
        public void shouldSetOrganization(){
            setUp();
            participant.setOrganization(IDeaS);
            assertTrue(participant.getOrganization().equals(IDeaS));
        }

}
