package com.sver.test.data;

import com.sver.core.domain.MessageTextCreator;

import java.util.ArrayList;
import java.util.Arrays;

public class MessageTextCreatorTest implements MessageTextCreator {

    public MessageTextCreatorTest() {}


    @Override
    public String createMessageText(
            ArrayList<String> disappearedPages,
            ArrayList<String> appearedPages,
            ArrayList<String> modifiedPages
    ) {
        return Arrays.toString(disappearedPages.toArray()) + "\n" +
                Arrays.toString(appearedPages.toArray())  + "\n" +
                Arrays.toString(modifiedPages.toArray());
    }
}
