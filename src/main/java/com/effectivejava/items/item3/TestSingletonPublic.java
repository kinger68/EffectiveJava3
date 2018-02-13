package com.effectivejava.items.item3;

public class TestSingletonPublic {
    public static void main(String[] args) {
        SingletonPublic singleton = SingletonPublic.INSTANCE;
        SingletonPublic singleton2 = SingletonPublic.INSTANCE;
        System.out.println("singleton hashCode=" + singleton.hashCode());
        System.out.println("singleton2 hashCode=" + singleton2.hashCode());
    }
}
