package com.explore.java.base.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * 如果要访问类型T的对象，并对其执行某些操作，就可以使用 Consumer
 *
 * @author weiqingjing@jd.com
 * @date 2022/5/10 11:23 AM
 */
public class ConsumerDemo {

    public static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }

    public static void main(String[] args) {
        List<String> arrays = Arrays.asList("a", "b", "c", "d", "e", "f");
        forEach(arrays, (String s) -> System.out.println(s));
    }

}
