package com.explore.java.base.function.demo.apple;

/**
 * @author weiqingjing@jd.com
 * @date 2022/4/27 3:02 PM
 */
public class AppleSimpleFormatter implements AppleFormatter {

    @Override
    public String apply(Apple apple) {
        return "An apple of " + apple.getWeight() + "g";
    }
}
