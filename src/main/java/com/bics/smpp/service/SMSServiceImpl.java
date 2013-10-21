package com.bics.smpp.service;

import com.bics.smpp.domain.SMSMessage;
import com.bics.smpp.domain.SendSMSResponse;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class SMSServiceImpl implements SMSService {

    public SendSMSResponse send(SMSMessage smsMessage) {
        SendSMSResponse response = new SendSMSResponse();
        boolean success = (new Random()).nextBoolean();
        response.setSuccess(success);
        if (!success) {
            response.setMessage("Test error! Service hash code: "+this.hashCode());
        }
        return response;
    }

}
