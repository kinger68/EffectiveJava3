package com.effectivejava.items.item3;

import java.io.*;

public class TestSingletonSerialization {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        SerializedSingletonPublic singleton = SerializedSingletonPublic.INSTANCE;
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                "filename.ser"));
        out.writeObject(singleton);
        out.close();

        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream(
                "filename.ser"));
        SerializedSingletonPublic singleton2 = (SerializedSingletonPublic) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode=" + singleton.hashCode());
        System.out.println("instanceTwo hashCode=" + singleton2.hashCode());

    }
}
