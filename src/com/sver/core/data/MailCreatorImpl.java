package com.sver.core.data;

import com.sver.core.data.entity.Message;
import com.sver.core.domain.MailCreator;
import com.sver.core.domain.MessageTextCreator;

import java.util.List;
import java.util.Map;

import static com.sver.utils.MapUtils.getDifference;
import static com.sver.utils.MapUtils.getSameKeyDifferentValues;

public class MailCreatorImpl implements MailCreator {
    private final MessageTextCreator messageTextCreator;

    public MailCreatorImpl(MessageTextCreator messageTextCreator) {
        this.messageTextCreator = messageTextCreator;
    }



    @Override
    public Message createMessage(Map<String, String> yesterdayStates, Map<String, String> todayStates) {
        List<String> disappearedPages = getDifference(yesterdayStates, todayStates);
        List<String> appearedPages = getDifference(todayStates, yesterdayStates);
        List<String> modifiedPages = getSameKeyDifferentValues(yesterdayStates, todayStates);

        String messageText = messageTextCreator.createMessageText( disappearedPages, appearedPages, modifiedPages );

        return new Message(messageText);
    }




}
