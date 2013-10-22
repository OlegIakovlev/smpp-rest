package com.bics.smpp.domain.send;

import com.bics.smpp.domain.enums.StatusType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: id967216
 * Date: 22/10/13
 * Time: 12:18
 * To change this template use File | Settings | File Templates.
 */
public class SMSResponse {
    private final StatusType status;
    private List<SingleSMSStatus> sendSMSStatuses = new ArrayList<SingleSMSStatus>();

    public SMSResponse(StatusType status) {
        this.status = status;
    }

    public List<SingleSMSStatus> getSendSMSStatuses() {
        return sendSMSStatuses;
    }

    public void setSendSMSStatuses(List<SingleSMSStatus> sendSMSStatuses) {
        this.sendSMSStatuses = sendSMSStatuses;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("SMSResponse [status=").append(status).
                append(", SMSStatuses=").append(sendSMSStatuses).append("]").toString();
    }
}
