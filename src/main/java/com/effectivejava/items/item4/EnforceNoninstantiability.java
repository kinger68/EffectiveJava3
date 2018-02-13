package com.effectivejava.items.item4;

import java.lang.Math;
import java.util.Arrays;
import java.util.List;

public class EnforceNoninstantiability {
    public static void main(String[] args) {
        // java.lang.Math class is one that cannot be instantiated
        System.out.println(Math.E * Math.PI);
        List<String> stList = Arrays.asList("1", "2", "3");
        System.out.println("stList = " + stList);
    }
}
