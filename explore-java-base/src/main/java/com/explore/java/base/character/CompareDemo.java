package com.explore.java.base.character;

/**
 * @author weiqingjing@jd.com
 * @date 2022/5/27 6:50 PM
 */
public class CompareDemo {


    public static void compare(Integer a, Integer b) {
        Integer a1 = a + 1;
        Integer b1 = b + 1;
        System.out.println("" + (a1 == b1));
        System.out.println("" + (a1.equals(b1)));
    }

    public static void main(String[] args) {
        int p1 = 130;
        int p2 = 130;
        compare(p1,p2);
    }
}
