package com.sver.domain;

import java.util.ArrayList;

public interface MessageTextCreator {
    public String createMessageText(
            ArrayList<String> disappearedPages,
            ArrayList<String> appearedPages,
            ArrayList<String> modifiedPages
    );


}
