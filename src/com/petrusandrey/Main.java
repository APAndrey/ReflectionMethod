package com.petrusandrey;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        TestClassMethod testClassMethod = new TestClassMethod(10, 12);

        String nameTest1 = "test1";
        String nameTest2 = "test2";


        try {
            Method method = testClassMethod
                    .getClass()
                    .getDeclaredMethod(nameTest1);

            method.setAccessible(true);
            method.invoke(testClassMethod);
            method.setAccessible(false);

            Method method1 = testClassMethod
                    .getClass()
                    .getDeclaredMethod(nameTest2);

            method1.setAccessible(true);
            method1.invoke(testClassMethod);
            method1.setAccessible(false);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
