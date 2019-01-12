package com.muming.chapter04.myException;

import org.junit.Test;

public class JavaExc {

    @Test
    public void test() {
        try {
            int i = 0;
            int b = 10;
            int c = b / i;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }
}
