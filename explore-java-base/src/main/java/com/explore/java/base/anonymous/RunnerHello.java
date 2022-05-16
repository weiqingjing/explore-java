package com.explore.java.base.anonymous;

/**
 * @author 314654925@qq.com
 * @date 2022/5/10 9:34 PM
 */
public class RunnerHello {

    public static void main(String[] args) {

        HelloWorld englishHello = new HelloWorld() {
            final static String var = "abc";

            @Override
            public void greet() {
                System.out.println("english hello");
            }

            @Override
            public void greetSomeone(String someone) {
                System.out.println("english hello boy");
            }
        };

    }

}
