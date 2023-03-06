package com.sver.core.domain;

import com.sver.core.data.entity.Message;
import java.util.Map;

public interface MailCreator {

    Message createMessage(
            Map<String, String> yesterdayStates,
            Map<String, String> todayStates
    );

}
