package com.muming.chapter05;

import java.math.BigDecimal;

public class Test {

    @org.junit.Test
    public void test() {
        Double a = new Double(0.5);
        BigDecimal c = new BigDecimal(0.5);
        System.out.println(a + "\n" + c);
    }

}

