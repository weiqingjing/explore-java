package com.explore.java.base.modifers.two;

import com.explore.java.base.modifers.one.Alpha;

/**
 * @author 314654925@qq.com
 * @date 2022/4/27 9:54 AM
 */
public class Gamma {

    public void visibility(){
        Alpha alpha = new Alpha();
        Integer one = alpha.one;
    }
}
