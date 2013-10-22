package com.bics.smpp.service;

import com.bics.smpp.domain.send.SMSMessage;
import com.bics.smpp.domain.send.SMSResponse;

public interface SMSService {
    public SMSResponse send(SMSMessage smsMessage);
}
