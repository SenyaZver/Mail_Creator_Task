package com.sver.utils;

import java.util.*;

public class MapUtils {

    public static <T, E> ArrayList<T> getDifference(
            Map<T, E> first,
            Map<T, E> second
    ) {
        ArrayList<T> result = new ArrayList<>();

        for (T key : first.keySet()) {
            if (!second.containsKey(key)) {
                result.add(key);
            }
        }

        return result;
    }


    public static <T, E> ArrayList<T> getSameKeyDifferentValues(
            Map<T, E> first,
            Map<T, E> second
    ) {
        ArrayList<T> result = new ArrayList<>();


        Set<T> intersection = new HashSet<T>(first.keySet());
        intersection.retainAll(second.keySet());

        for (T key: intersection) {
            E firstValue = first.get(key);
            E secondValue = second.get(key);

            if (!firstValue.equals(secondValue)) {
                result.add(key);
            }
        }


        return result;
    }



}
