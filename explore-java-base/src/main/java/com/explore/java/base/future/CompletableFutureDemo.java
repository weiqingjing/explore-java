package com.explore.java.base.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFutureDemo {

    public void useAsyncPrice() {
        Shop shop = new Shop("DestShop");

        long start = System.nanoTime();
        Future<Double> futurePrice = shop.getPriceAsync("my favorite product");
        long invocationTime = ((System.nanoTime() - start) / 1_000_000);
        System.out.println("Invocation returned after " + invocationTime + " msecs");

        doSomethingElse();

        try {
            double price = futurePrice.get();
            System.out.printf("Price is %.2f%n", price);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        long retrievalTime = ((System.nanoTime() - start) / 1_000_000);
        System.out.println("Price returned after " + retrievalTime + " msecs");

    }

    private void doSomethingElse(){
        System.out.printf("do something else");
    }
}
