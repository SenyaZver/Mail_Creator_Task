package com.sver.model;

import com.sver.domain.MailCreator;
import com.sver.domain.MessageTextCreator;
import com.sver.model.entity.Message;

import java.util.*;

import static com.sver.utils.MapUtils.getDifference;
import static com.sver.utils.MapUtils.getSameKeyDifferentValues;

public class MailCreatorImpl implements MailCreator {
    private final MessageTextCreator messageTextCreator;

    public MailCreatorImpl(MessageTextCreator messageTextCreator) {
        this.messageTextCreator = messageTextCreator;
    }


    @Override
    public Message createMessage(HashMap<String, String> yesterdayStates, HashMap<String, String> todayStates) {
        ArrayList<String> disappearedPages = getDifference(yesterdayStates, todayStates);
        ArrayList<String> appearedPages = getDifference(todayStates, yesterdayStates);
        ArrayList<String> modifiedPages = getSameKeyDifferentValues(yesterdayStates, todayStates);

        String messageText = messageTextCreator.createMessageText( disappearedPages, appearedPages, modifiedPages );

        return new Message(messageText);
    }




}
