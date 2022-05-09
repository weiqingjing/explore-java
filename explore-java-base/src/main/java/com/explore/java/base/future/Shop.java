package com.explore.java.base.future;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public class Shop {
    static Random random = new Random();

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shop(String name) {
        this.name = name;
    }

    //同步获得价格API
    public double getPrice(String product) {
        return calculatePrice(product);
    }

    //异步获得价格API
    public Future<Double> getPriceAsync(String product) {
        //创建CompletableFuture对象，，它包含计算价格的结果
        CompletableFuture<Double> futurePrice = new CompletableFuture<>();

        //在另外一个线程中以异步方式执行计算
        new Thread(() -> {
            double price = calculatePrice(product);
            //需要长时间计算的任务结束返回结果，设置future的返回值
            futurePrice.complete(price);
        }).start();

        //无需等待计算结果直接返回Future对象
        return futurePrice;
    }

    private double calculatePrice(String product) {
        delay();
        return random.nextDouble() * product.charAt(0) + product.charAt(1);
    }

    //采用delay方法模拟这些长期运行的方法的执行
    public static void delay() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }




}
