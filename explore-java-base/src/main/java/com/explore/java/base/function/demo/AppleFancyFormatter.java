package com.explore.java.base.function.demo;

import com.explore.java.base.function.Apple;

/**
 * @author weiqingjing@jd.com
 * @date 2022/4/27 3:01 PM
 */
public class AppleFancyFormatter implements AppleFormatter {

    @Override
    public String apply(Apple apple) {
        String characteristic = apple.getWeight() > 150 ? "heavy" :
            "light";
        return "A " + characteristic +
            " " + apple.getColor() + " apple";
    }
}
