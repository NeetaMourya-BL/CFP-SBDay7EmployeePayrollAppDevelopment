package com.bridgelabz.employeepayrollappdevelopment.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class EmailListener {

    @Autowired
    private EmailSenderService sender;

//    @EventListener(ApplicationReadyEvent.class)
    public void sendMail() {
        sender.sendEmail("neeta.mourya@bridgelabz.com", "Test Email", "Registered SuccessFully1");


    }
}