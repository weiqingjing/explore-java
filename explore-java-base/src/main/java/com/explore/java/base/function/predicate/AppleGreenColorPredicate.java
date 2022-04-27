package com.explore.java.base.function.predicate;

import com.explore.java.base.function.Apple;

/**
 * @author weiqingjing@jd.com
 * @date 2022/4/27 2:39 PM
 */
public class AppleGreenColorPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
