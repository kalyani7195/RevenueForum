package com.ideas.RevenueManagementForum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;
import org.springframework.mail.javamail.JavaMailSender;

import java.util.stream.Collectors;

/**
 * Created by idnklm on 3/20/2018.
 */

@Service
public class NotificationService {

    private final String mailSubject="Thanks for registration";
    private final String participantDetailsMailSubject="Participants List";
    private JavaMailSender javaMailSender;

    @Autowired
    public NotificationService(JavaMailSender javaMailSender){
        this.javaMailSender=javaMailSender;
    }

    public void sendNotificationTo(Participant participant) throws MailException{
        SimpleMailMessage mail=new SimpleMailMessage();
        mail.setTo(participant.getEmailId());
        StringBuilder mailBuilder= new StringBuilder();
        mailBuilder.append("Thank you for registering for the Revenue Management Forum. \n" +
                "You will shortly hear from us with additional details related to the forum. \n" +
                "In the meantime, should you have any queries please feel free to reach out to contact@rmforum.co.in");

        mail.setSubject(mailSubject);
        mail.setText(mailBuilder.toString());
        javaMailSender.send(mail);
        System.out.println("Sending An email");

    }


    public void sendParticipantDetailsToAdmins(RevenueForumEvent revenueForumEvent){
        String[] listOfAdmins={"kalyani7195@gmail.com"};
        SimpleMailMessage mail= new SimpleMailMessage();
        mail.setTo(listOfAdmins);
        String participantDetailsMail="";
        for (Participant participant : revenueForumEvent.getParticipants()) {
             participantDetailsMail += participant.getName() + " | " + participant.getEmailId() + " | " + participant.getOrganization()+"             ";
        }
        mail.setSubject(participantDetailsMailSubject);
        mail.setText(participantDetailsMail);
        javaMailSender.send(mail);
        System.out.println("Sending email to admins");


    }




}
