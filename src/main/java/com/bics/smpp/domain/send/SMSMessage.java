package com.bics.smpp.domain.send;

import java.util.ArrayList;
import java.util.List;


public class SMSMessage {

    private String sender;
    private List<String> recipients = new ArrayList<String>();
    private String msg;

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public List<String> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<String> recipients) {
        this.recipients = recipients;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("SMSMessage [sender=").append(sender).
                append(", recipients=").append(recipients).
                append(", msg=").append(msg).append("]").toString();
    }


}
