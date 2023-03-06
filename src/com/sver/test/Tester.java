package com.sver.test;

import com.sver.core.data.MailCreatorImpl;
import com.sver.core.domain.MailCreator;
import com.sver.core.domain.MessageTextCreator;
import com.sver.model.entity.Message;
import com.sver.test.data.MessageTextCreatorTest;
import java.util.ArrayList;
import java.util.HashMap;

import static com.sver.test.data.WebsitesExamples.*;
import static com.sver.utils.MapUtils.getDifference;
import static com.sver.utils.MapUtils.getSameKeyDifferentValues;


//A simple tester, I didn't write asserts to make it possible to see from console
public class Tester {

    public static void GetSameKeyDifferentValuesTestCase() {
        //init
        HashMap<String, String> yesterdayState = new HashMap<>();
        HashMap<String, String> todayState = new HashMap<>();

        yesterdayState.put(EXAMPLE_1.getKey(), EXAMPLE_1.getValue());
        yesterdayState.put(EXAMPLE_2.getKey(), EXAMPLE_2.getValue());
        yesterdayState.put(EXAMPLE_3.getKey(), EXAMPLE_3.getValue());

        todayState.put(EXAMPLE_1_1.getKey(), EXAMPLE_1_1.getValue());
        //

        ArrayList<String> result = getSameKeyDifferentValues(yesterdayState, todayState);


        if (result.contains(EXAMPLE_1.getKey())) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }


    public static void GetDifferenceTestCase() {
        //init
        HashMap<String, String> yesterdayState = new HashMap<>();
        HashMap<String, String> todayState = new HashMap<>();

        yesterdayState.put(EXAMPLE_1.getKey(), EXAMPLE_1.getValue());

        todayState.put(EXAMPLE_1_1.getKey(), EXAMPLE_1_1.getValue());
        todayState.put(EXAMPLE_2.getKey(), EXAMPLE_2.getValue());
        todayState.put(EXAMPLE_3.getKey(), EXAMPLE_3.getValue());
        //

        ArrayList<String> result = getDifference(todayState, yesterdayState);


        if (result.contains(EXAMPLE_2.getKey()) && result.contains(EXAMPLE_3.getKey())) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }


    //a full start to end test which isn't too pretty
    public static void StartToEndTestCase() {
        //init
        HashMap<String, String> yesterdayState = new HashMap<>();
        HashMap<String, String> todayState = new HashMap<>();

        yesterdayState.put(EXAMPLE_1.getKey(), EXAMPLE_1.getValue());
        yesterdayState.put(EXAMPLE_2.getKey(), EXAMPLE_2.getValue());
        yesterdayState.put(EXAMPLE_3.getKey(), EXAMPLE_3.getValue());

        todayState.put(EXAMPLE_1.getKey(), EXAMPLE_1.getValue());
        //

        MessageTextCreator messageTextCreator = new MessageTextCreatorTest();

        MailCreator mailCreator = new MailCreatorImpl(messageTextCreator);
        Message message = mailCreator.createMessage(yesterdayState, todayState);


        //checking if result is correct
        ArrayList<String> correctDisappearedPages = new ArrayList<>();
        correctDisappearedPages.add(EXAMPLE_2.getKey());
        correctDisappearedPages.add(EXAMPLE_3.getKey());

        if (message.getText().equals(messageTextCreator.createMessageText(
                    correctDisappearedPages,
                    new ArrayList<>(),
                    new ArrayList<>()))
        ) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }


}
