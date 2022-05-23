package com.explore.java.base.function.demo.apple.predicate;

import com.explore.java.base.function.demo.apple.AppleFactory;

/**
 * @author 314654925@qq.com
 * @date 2022/4/27 2:44 PM
 */
public class AppleRun {

    public static void main(String[] args) {
        System.out.println(
            AppleFilter.filterApples(AppleFactory.inventory, new AppleGreenColorPredicate())
        );
    }
}
