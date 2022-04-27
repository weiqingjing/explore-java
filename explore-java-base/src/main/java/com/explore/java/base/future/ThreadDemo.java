package com.explore.java.base.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

/**
 * @author weiqingjing@jd.com
 * @date 2022/4/20 10:23 AM
 */
public class ThreadDemo {

    public int calNum() {
        System.out.println("calNum----" + Thread.currentThread().getName());

        CompletableFuture<Integer> future = new CompletableFuture<>();
        new Thread(() -> {
            int result = calculatePrice();
            future.complete(result);
        }).start();

        return 100;
    }

    private int calculatePrice() {
        System.out.println("calculatePrice----" + Thread.currentThread().getName());

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "-----" + i);
        }
        return 10;
    }
}
