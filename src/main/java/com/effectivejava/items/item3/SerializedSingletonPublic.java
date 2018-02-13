package com.effectivejava.items.item3;

import java.io.Serializable;

public class SerializedSingletonPublic implements Serializable {
    //    public static final SingletonPublic INSTANCE;
    public static final SerializedSingletonPublic INSTANCE;
    static {
        INSTANCE = new SerializedSingletonPublic();

    }

    private SerializedSingletonPublic() {
    }

    public void printInstance() {
        System.out.println("INSTANCE = " + INSTANCE);
    }

    // Ensure singleton with serialization
    private Object readResolve() {
        return INSTANCE;
    }

    int value;
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}
