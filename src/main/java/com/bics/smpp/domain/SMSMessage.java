package com.bics.smpp.domain;

import java.util.ArrayList;
import java.util.List;


public class SMSMessage {

    private String messageText;
    private Integer senderNumber;
    private List<Integer> receiverNumbers = new ArrayList<Integer>();

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Integer getSenderNumber() {
        return senderNumber;
    }

    public void setSenderNumber(Integer senderNumber) {
        this.senderNumber = senderNumber;
    }

    public List<Integer> getReceiverNumbers() {
        return receiverNumbers;
    }

    public void setReceiverNumbers(List<Integer> receiverNumbers) {
        this.receiverNumbers = receiverNumbers;
    }

    @Override
    public String toString() {
        return "SMSMessage [messageText=" + messageText + ", senderNumber=" + senderNumber + ", receiverNumbers=" + receiverNumbers + "]";
    }


}
