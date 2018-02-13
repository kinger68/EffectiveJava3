package com.effectivejava.items.item3;

import java.util.Objects;

public class SingletonFactory {
    private static final SingletonFactory INSTANCE;


    static {
        INSTANCE = new SingletonFactory();
    }

    private SingletonFactory() {
        // Could do something in the constructor
    }

    public static SingletonFactory getInstance() { return INSTANCE; }
    public void printInstance() {
        System.out.println("INSTANCE = " + INSTANCE);
    }

    int value;
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}
