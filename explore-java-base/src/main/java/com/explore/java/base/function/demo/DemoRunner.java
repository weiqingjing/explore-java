package com.explore.java.base.function.demo;

import com.explore.java.base.function.Apple;
import com.explore.java.base.function.AppleFactory;
import java.util.List;

/**
 * @author weiqingjing@jd.com
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
