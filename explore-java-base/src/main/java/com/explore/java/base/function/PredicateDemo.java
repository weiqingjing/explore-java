package com.explore.java.base.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 表示一个涉及类型T的布尔表达式时，就可以使用 Predicate
 *
 * @author weiqingjing@jd.com
 * @date 2022/5/10 10:59 AM
 */
public class PredicateDemo {

    public static <T> List<T> filter(List<T> l, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T t : l) {
            if (p.test(t)) {
                result.add(t);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> arrays = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = filter(arrays, (Integer a) -> a > 3);
        System.out.printf(result.toString());
    }
}
