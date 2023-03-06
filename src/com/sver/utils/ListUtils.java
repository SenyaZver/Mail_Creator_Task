package com.sver.utils;



import java.util.List;

public class ListUtils {
    public static <T> String formatInCurlyBraces(List<T> list) {
        StringBuilder sb = new StringBuilder(list.toString());
        sb.replace(0,1, "{");
        sb.replace(sb.length() - 1,sb.length(), "}");

        return sb.toString();
    }

}
