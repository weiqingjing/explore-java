package com.explore.java.base.lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 把Lambda付诸实践:环绕执行模式
 *
 * @author weiqingjing@jd.com
 * @date 2022/5/7 6:15 PM
 */
public class ExecuteAround {

    public static String processFile() throws IOException {
        try (BufferedReader br = new BufferedReader(
            new FileReader("data.txt"))) {
            return br.readLine();
        }
    }

    public static String processFileByProcessor(BufferedReaderProcessor processor) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            return processor.process(br);
        }
    }

//    String result = processFile((BufferedReader br) ->
//        br.readLine() + br.readLine());

    public static void main(String[] args) {
        try {
            processFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //行为参数化，传递行为, 读一行
        try {
            String oneLine = processFileByProcessor((BufferedReader r) -> r.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            String twoLine = processFileByProcessor((BufferedReader r) -> r.readLine() + r.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            String twoLine = processFileByProcessor((BufferedReader r) -> {
                return r.readLine() + r.readLine();
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
