package com.explore.java.base.function.demo.apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author weiqingjing@jd.com
 * @date 2022/4/27 10:24 AM
 */
public class FilteringApplesAfter {

    //行为参数化，入参一个计算函数
    public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("filter green apples:" + filterApples(AppleFactory.inventory, Apple::isGreenApple));
        System.out.println("filter heavy apples:" + filterApples(AppleFactory.inventory, Apple::isHeavyApple));

        //适用于只使用一次的场景，直接用匿名函数表示
        System.out.println("filter green apples:" + filterApples(AppleFactory.inventory,
            (Apple apple) -> "green".equals(apple.getColor())
        ));

        System.out.println("filter heavy apples:" + filterApples(AppleFactory.inventory,
            (Apple apple) -> apple.getWeight() > 150
        ));


    }
}
