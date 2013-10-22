package com.bics.smpp.service;

import com.bics.smpp.domain.enums.StatusType;
import com.bics.smpp.domain.send.SMSMessage;
import com.bics.smpp.domain.send.SMSResponse;
import com.bics.smpp.domain.send.SingleSMSStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class SMSServiceImpl implements SMSService {

    public SMSResponse send(SMSMessage smsMessage) {
        Random random = new Random();
        SMSResponse response = new SMSResponse(StatusType.PARTIAL_FAILURE);
        List<String> recipientList = smsMessage.getRecipients();
        for (int i = 0; i < smsMessage.getRecipients().size(); i++) {
            SingleSMSStatus status = new SingleSMSStatus();
            boolean success = random.nextBoolean();
            status.setRecipient(recipientList.get(i));
            status.setSuccess(success);
            if (!success) {
                status.setMessage("Test error!");
            }
            response.getSendSMSStatuses().add(status);
        }
        return response;
    }

}
