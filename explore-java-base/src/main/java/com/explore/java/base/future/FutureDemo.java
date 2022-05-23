package com.explore.java.base.future;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @author 314654925@qq.com
 * @date 2022/4/19 7:49 PM
 */
public class FutureDemo {

    public void doHouseWork() {

        //创建ExecutorService，通过它你可以向线程池提交任务
        ExecutorService executor = Executors.newCachedThreadPool();

        //向ExecutorService提交一个Callable对象
        Future<Double> future = executor.submit(new Callable<Double>() {
            public Double call() throws Exception {
                //子线程超时场景
                //return washHairToLongTime();

                //以异步方式在新的线程中执行耗时的操作
                return washClothes();
            }
        });

        //异步操作进行的同时你可以做其他的事情
        mopFloor();

        try {
            //检查是否完成
            System.out.println("isDone:" + future.isDone());
            //获取异步操作的结果，如果最终被阻塞，无法得到结果，那么在最多等待1秒钟之后退出
            future.get(1, TimeUnit.SECONDS);
            System.out.println("isDone:" + future.isDone());

        } catch (InterruptedException e) {
            System.out.println("当前线程在等待过程中被中断");
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println("计算抛出一个异常");
            e.printStackTrace();
        } catch (TimeoutException e) {
            System.out.println("在Future对象完成之前超时");
            e.printStackTrace();
        }
    }

    private Double washClothes() {
        System.out.println("洗衣服100分钟");
        return 100.00;
    }

    private Double mopFloor() {
        System.out.println("擦地板30分钟");
        return 30.00;
    }

    @NotNull
    private Double washHairToLongTime() {
        //子线程超时
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("洗头发40分钟会超时");
        return 100.00;
    }

}
