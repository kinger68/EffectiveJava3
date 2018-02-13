package com.effectivejava.items.item3;

public class TestSingletonEnum {
    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.INSTANCE;
		SingletonEnum singleton2 = SingletonEnum.INSTANCE;

        System.out.println("singleton2.getValue() = " + singleton2.getValue());
        singleton.setValue(42);
        System.out.println("singleton2.getValue() = " + singleton2.getValue());

        System.out.println("singleton hashCode=" + singleton.hashCode());
        System.out.println("singleton2 hashCode=" + singleton2.hashCode());
    }
}