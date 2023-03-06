package com.sver.model;

import com.sver.domain.MessageTextCreator;

import java.util.ArrayList;

import static com.sver.utils.ListUtils.formatInCurlyBraces;

public class MessageTextCreatorImpl implements MessageTextCreator {

    public MessageTextCreatorImpl() {}


    @Override
    public String createMessageText(ArrayList<String> disappearedPages, ArrayList<String> appearedPages, ArrayList<String> modifiedPages) {
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
