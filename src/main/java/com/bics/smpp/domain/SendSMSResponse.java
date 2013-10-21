package com.bics.smpp.domain;

/**
 * Created with IntelliJ IDEA.
 * User: id967216
 * Date: 21/10/13
 * Time: 17:15
 * To change this template use File | Settings | File Templates.
 */
public class SendSMSResponse {
    private boolean success;
    private String message;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("SendSMSResponse [success=").append(success).
                append(", message=").append(message).append("]").toString();
    }
}
