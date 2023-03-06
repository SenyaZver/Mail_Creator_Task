package com.sver.core.domain;

import com.sver.model.entity.Message;

import java.util.HashMap;

public interface MailCreator {

    Message createMessage(
            HashMap<String, String> yesterdayStates,
            HashMap<String, String> todayStates
    );

}
