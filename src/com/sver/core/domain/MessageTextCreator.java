package com.sver.core.domain;

import java.util.ArrayList;

public interface MessageTextCreator {
    String createMessageText(
            ArrayList<String> disappearedPages,
            ArrayList<String> appearedPages,
            ArrayList<String> modifiedPages
    );


}
