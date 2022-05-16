package com.explore.java.base.function.demo.apple.predicate;

import com.explore.java.base.function.demo.apple.Apple;

/**
 * @author 314654925@qq.com
 * @date 2022/4/27 2:39 PM
 */
public class AppleGreenColorPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
