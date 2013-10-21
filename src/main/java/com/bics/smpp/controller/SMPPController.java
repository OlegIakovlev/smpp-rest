package com.bics.smpp.controller;

import com.bics.smpp.domain.SMSMessage;
import com.bics.smpp.service.SMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("smpp/api")
public class SMPPController {

    SMSService smsService;

    @Autowired
    public SMPPController(SMSService smsService) {
        this.smsService = smsService;
    }

    /**
     * Sends new smsMessage.
     * Spring automatically binds all the parameters in the request to the smsMessage argument
     *
     * @param smsMessage
     * @return Object indicating success or failure of send
     */
    @RequestMapping(value = "sendSMS", method = RequestMethod.POST)
    @ResponseBody
    public String savePerson(SMSMessage smsMessage, @RequestHeader(value = "Version", required = false) String version) {
        smsService.send(smsMessage);
        return "Service version " + (StringUtils.isEmpty(version) ? " is not specified" : version);
    }

}
