package com.sver.core.data;


import com.sver.core.domain.MessageTextCreator;

import java.util.List;

import static com.sver.utils.ListUtils.formatInCurlyBraces;

public class MessageTextCreatorImpl implements MessageTextCreator {

    public MessageTextCreatorImpl() {}


    @Override
    public String createMessageText(List<String> disappearedPages, List<String> appearedPages, List<String> modifiedPages) {
        return "Здравствуйте, дорогая и.о. секретаря \n" +
                "\n" +
                "За последние сутки во вверенных Вам сайтах произошли следующие изменения: \n" +
                "\n" +
                "Исчезли следующие страницы: " + formatInCurlyBraces(disappearedPages) + "\n" +
                "Появились следующие страницы: " + formatInCurlyBraces(appearedPages)  + "\n" +
                "Изменились следующие страницы: " + formatInCurlyBraces(modifiedPages)  + "\n" +
                "\n" +
                "С уважением,\n" +
                "автоматизированная система\n" +
                "мониторинга.";
    }
}
