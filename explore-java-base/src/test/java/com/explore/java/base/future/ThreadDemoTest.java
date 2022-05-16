package com.explore.java.base.future;

import org.junit.jupiter.api.Test;

/**
 * @author 314654925@qq.com
 * @date 2022/4/20 10:29 AM
 */
class ThreadDemoTest {

    @Test
    void calNum() {
        ThreadDemo demo = new ThreadDemo();
        System.out.println("主线程计算结果：" + demo.calNum());
    }
}