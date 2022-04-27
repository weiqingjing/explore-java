package com.explore.java.base.modifers.two;

import com.explore.java.base.modifers.one.Alpha;

/**
 * @author weiqingjing@jd.com
 * @date 2022/4/27 9:50 AM
 */
public class AlphaSub extends Alpha {
    public void visibility(){
        Integer one = this.one;
        Integer two = super.two;
    }
}
