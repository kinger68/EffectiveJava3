package com.effectivejava.items.item3;

public class SingletonPublic {
    //    public static final SingletonPublic INSTANCE;
    public static final SingletonPublic INSTANCE;
    static {
        INSTANCE = new SingletonPublic();
    }

    private SingletonPublic() {
    }

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
