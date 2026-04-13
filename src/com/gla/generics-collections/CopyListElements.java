package com.gla.generics-collections;

import java.util.List;

public class CopyListElements {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number i : src) {
            dest.add(i);
        }
    }
}
