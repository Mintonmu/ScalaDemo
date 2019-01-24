package com.muming.chapter08.abstactdemo.innerclass.javainnerclass;

class OuterClass {

    String name = "jack";

    class InnerClass {


        public void test(InnerClass ic) {
            System.out.println(ic);
        }
    }

    static class StaticInnerClass {

    }

}
