package com.explore.java.base.future;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompletableFutureDemoTest {

    @Test
    void useAsyncPrice() {
        CompletableFutureDemo futureDemo = new CompletableFutureDemo();
        futureDemo.useAsyncPrice();
    }
}