package com.bics.smpp.service;

import com.bics.smpp.domain.SMSMessage;
import com.bics.smpp.domain.SendSMSResponse;

public interface SMSService {
    public SendSMSResponse send(SMSMessage smsMessage);
}
