package com.petrusandrey;

public class TestClassMethod {

    private int a;
    private int b;

    public TestClassMethod(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    private void test1() {
        System.out.println("Test 1: " + a);
    }

    private void test2() {
        System.out.println("Test 2: " + b);
    }

    private void test3() {
        System.out.println("Test 3: " + a);
    }

    @Override
    public String toString() {
        return "TestClassMethod{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

