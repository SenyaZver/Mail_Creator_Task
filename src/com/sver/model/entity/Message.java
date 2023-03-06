package com.sver.model.entity;


//An immutable class, text is set only during creation
//In case messages need something other than text (headers, recievers, senders, etc) this class can be expanded
public class Message {
    private final String text;

    public Message(String text) { this.text = text; }

    //made a getter instead of a public final field to suit traditional Java code style
    public String getText() { return text; }


}
