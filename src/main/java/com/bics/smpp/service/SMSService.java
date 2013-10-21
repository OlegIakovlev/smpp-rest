package com.bics.smpp.service;

import com.bics.smpp.domain.SMSMessage;

public interface SMSService {
    public void send(SMSMessage smsMessage);
}
