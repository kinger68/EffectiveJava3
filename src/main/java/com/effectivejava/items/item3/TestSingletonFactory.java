package com.effectivejava.items.item3;

public class TestSingletonFactory {
    public static void main(String[] args) {
        SingletonFactory singleton = SingletonFactory.getInstance();
        SingletonFactory singleton2 = SingletonFactory.getInstance();
        System.out.println("singleton hashCode=" + singleton.hashCode());
        System.out.println("singleton2 hashCode=" + singleton2.hashCode());
    }
}