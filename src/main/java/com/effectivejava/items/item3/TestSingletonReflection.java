package com.effectivejava.items.item3;

import java.lang.reflect.Constructor;

public class TestSingletonReflection {


    public static void testReflectionDoesNotCreateNewInstancePublic() {
        SingletonPublic instance1 = SingletonPublic.INSTANCE;
        SingletonPublic instance2 = null;
        try {
            Constructor[] cstr = SingletonPublic.class.getDeclaredConstructors();
            for (Constructor constructor: cstr) {
                //Setting constructor accessible
                constructor.setAccessible(true);
                instance2
                        = (SingletonPublic) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

    public static void testReflectionDoesNotCreateNewInstanceEnum() {
        SingletonEnum singleton = SingletonEnum.INSTANCE;
        SingletonEnum singleton2 = null;
        try {
            Constructor[] cstr = SingletonEnum.class.getDeclaredConstructors();
            for (Constructor constructor: cstr) {
                //Setting constructor accessible
                constructor.setAccessible(true);
                singleton2
                        = (SingletonEnum) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(singleton.hashCode());
        System.out.println(singleton2.hashCode());
    }

    public static void main(String[] args) throws InterruptedException {
            TestSingletonReflection.testReflectionDoesNotCreateNewInstancePublic();
            Thread.sleep(10000);
            TestSingletonReflection.testReflectionDoesNotCreateNewInstanceEnum();
    }
}
