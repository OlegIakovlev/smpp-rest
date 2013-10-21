package com.bics.smpp.service;

import com.bics.smpp.domain.SMSMessage;
import org.springframework.stereotype.Service;

@Service
public class SMSServiceImpl implements SMSService {

    public void send(SMSMessage smsMessage) {
        System.out.println("Received smsMessage: " + smsMessage);
    }

}
