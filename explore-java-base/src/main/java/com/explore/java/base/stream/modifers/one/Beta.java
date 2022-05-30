package com.explore.java.base.stream.modifers.one;

/**
 * @author 314654925@qq.com
 * @date 2022/4/27 9:27 AM
 */
public class Beta {
    public void visibility(){
        Alpha alpha = new Alpha();
        Integer one = alpha.one;
        Integer two = alpha.two;
        Integer three = alpha.three;
        //无法访问私有filed
        //Integer four = alpha.four;
    }
}
