package com.explore.java.base.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author weiqingjing@jd.com
 * @date 2022/4/27 10:02 AM
 */
public class FilteringApplesBefore {

    static List<Apple> inventory = Arrays.asList(new Apple(80, "green"),
        new Apple(155, "green"),
        new Apple(120, "red"));

    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterHeavyApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > 150) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("filter green apples:"+filterGreenApples(inventory));
        System.out.println("filter heavy apples:"+filterHeavyApples(inventory));
    }

}
