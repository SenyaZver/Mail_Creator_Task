package com.sver.core.domain;

import java.util.List;

public interface MessageTextCreator {
    String createMessageText(
            List<String> disappearedPages,
            List<String> appearedPages,
            List<String> modifiedPages
    );


}
