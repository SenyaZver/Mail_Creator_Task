package com.sver.test.data;

import com.sver.core.domain.MessageTextCreator;

import java.util.List;

public class MessageTextCreatorTest implements MessageTextCreator {

    public MessageTextCreatorTest() {}


    @Override
    public String createMessageText(
            List<String> disappearedPages,
            List<String> appearedPages,
            List<String> modifiedPages
    ) {
        return disappearedPages.toString() + "\n" +
                appearedPages.toString()  + "\n" +
                modifiedPages.toString();
    }
}
