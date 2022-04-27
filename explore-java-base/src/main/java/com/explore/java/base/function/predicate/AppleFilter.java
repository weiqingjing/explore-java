package com.explore.java.base.function.predicate;

import com.explore.java.base.function.Apple;
import java.util.ArrayList;
import java.util.List;

/**
 * @author weiqingjing@jd.com
 * @date 2022/4/27 2:41 PM
 */
public class AppleFilter {

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
