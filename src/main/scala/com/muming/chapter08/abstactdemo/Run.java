package com.muming.chapter08.abstactdemo;

abstract class Tests {

    abstract void cry();
}

public abstract class Run extends Tests {
    public static void main(String[] args) {
        Tests tests = new Tests() {
            @Override
            void cry() {
                System.out.println("dawedad");
            }
        };

        tests.cry();
    }
}
