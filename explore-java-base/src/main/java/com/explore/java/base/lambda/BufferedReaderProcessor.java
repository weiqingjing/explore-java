package com.explore.java.base.lambda;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author 314654925@qq.com
 * @date 2022/5/7 6:28 PM
 */
@FunctionalInterface
public interface BufferedReaderProcessor {
    String process(BufferedReader b) throws IOException;
}