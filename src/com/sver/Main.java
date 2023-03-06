package com.sver;

import com.sver.core.data.MailCreatorImpl;
import com.sver.core.data.MessageTextCreatorImpl;
import com.sver.core.data.entity.Message;
import com.sver.core.domain.MailCreator;
import com.sver.test.Tester;


import java.util.HashMap;

import static com.sver.test.data.WebsitesExamples.*;

public class Main {
    //a quick example:
    public static void main(String[] args) {

        //init
        HashMap<String, String> yesterdayState = new HashMap<>();
        HashMap<String, String> todayState = new HashMap<>();

        yesterdayState.put(EXAMPLE_1.getKey(), EXAMPLE_1.getValue());
        yesterdayState.put(EXAMPLE_2.getKey(), EXAMPLE_2.getValue());
        yesterdayState.put(EXAMPLE_3.getKey(), EXAMPLE_3.getValue());

        todayState.put(EXAMPLE_1_1.getKey(), EXAMPLE_1_1.getValue());
        todayState.put(EXAMPLE_4.getKey(), EXAMPLE_4.getValue());
        //


        MailCreator mailCreator = new MailCreatorImpl(new MessageTextCreatorImpl());
        Message message = mailCreator.createMessage(yesterdayState, todayState);

        System.out.println(message.getText());
    }
}
