package com.explore.java.base.function.demo.apple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author weiqingjing@jd.com
 * @date 2022/4/27 2:10 PM
 */
public class FilteringApplesStream {

    public static void main(String[] args) {

        //顺序串行处理
        List<Apple> heavyApples = AppleFactory.inventory
            .stream()
            .filter((Apple apple) -> apple.getWeight() > 150)
            .collect(Collectors.toList());
        System.out.println("heavyApples:" + heavyApples);

        List<Apple> heavyApples2 = AppleFactory.inventory
            .parallelStream()
            .filter((Apple apple) -> apple.getWeight() > 150)
            .collect(Collectors.toList());
        System.out.println("heavyApples:" + heavyApples2);

        System.out.println("filter red apples:" + filterAppleByColor(AppleFactory.inventory, "red"));
        System.out.println("filter green apples:" + filterAppleByColor(AppleFactory.inventory, "green"));

    }

    public static List<Apple> filterAppleByColor(List<Apple> inventory, String color) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (color.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

}
