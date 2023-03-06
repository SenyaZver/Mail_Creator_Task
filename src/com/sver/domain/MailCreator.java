package com.sver.domain;

import com.sver.model.entity.Message;

import java.util.HashMap;

public interface MailCreator {

    public Message createMessage(
            HashMap<String, String> yesterdayStates,
            HashMap<String, String> todayStates
    );

}
