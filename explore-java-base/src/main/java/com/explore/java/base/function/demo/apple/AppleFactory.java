package com.explore.java.base.function.demo.apple;

import java.util.Arrays;
import java.util.List;

/**
 * @author 314654925@qq.com
 * @date 2022/4/27 2:08 PM
 */
public class AppleFactory {
    public static List<Apple> inventory = Arrays.asList(
        new Apple(80, "green"),
        new Apple(155, "green"),
        new Apple(120, "red"));
}
