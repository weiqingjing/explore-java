package com.explore.java.base.function;

/**
 * @author weiqingjing@jd.com
 * @date 2022/4/27 10:00 AM
 */
public class Apple {

    private Integer weight;
    private String color;


    public String getColor() {
        return color;
    }

    public Apple(Integer weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
            "weight=" + weight +
            ", color='" + color + '\'' +
            '}';
    }

    public static boolean isGreenApple(Apple apple) {
        return "green".equals(apple.getColor());
    }

    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 150;
    }
}
