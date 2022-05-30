package com.explore.java.base.character;

/**
 * @author weiqingjing@jd.com
 * @date 2022/5/27 10:12 AM
 */
public class CharacterSetDemo {

    public static void main(String[] args) {
        char visibleC1 = 'a';//显示字符
        char visibleC2 = '\141';//八进制
        System.out.println(visibleC1);
        System.out.println(visibleC2);

        char invisibleC3 = '\012';//不可显示字符，用八进制标识
        System.out.println("abc" + invisibleC3 + "def");

        char invisibleC4 = '\n';//不可显示字符，用转义符标识
        System.out.println("abc" + invisibleC4 + "def");

        char ch = 97;
        System.out.println(ch);

        char[] chars = new char[]{'1', '2', '3','.'};
        int result = convert(chars, 4);
        System.out.println(result);
    }

    public static int convert(char[] chs, int n) {
        int res = 0;
        for (int i = 0; i < n; ++i) {
            res = res * 10 + (chs[i] - '0');
        }
        return res;
    }
}
