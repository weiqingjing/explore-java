package com.explore.java.base.function.demo.apple;

import java.util.List;

/**
 * @author 314654925@qq.com
 * @date 2022/4/27 3:02 PM
 */
public class DemoRunner {

    public static void main(String[] args) {
        prettyPrintApple(AppleFactory.inventory, new AppleFancyFormatter());
        prettyPrintApple(AppleFactory.inventory, new AppleSimpleFormatter());
    }

    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter) {
        for (Apple apple : AppleFactory.inventory) {
            System.out.println(formatter.apply(apple));
        }
    }
}
