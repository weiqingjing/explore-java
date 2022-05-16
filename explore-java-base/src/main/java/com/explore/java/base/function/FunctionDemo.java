package com.explore.java.base.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * 如果你需要定义一个Lambda,将输入的对象映射到输出，就可以使用 Function
 *
 * @author 314654925@qq.com
 * @date 2022/5/10 11:42 AM
 */
public class FunctionDemo {

    //这个示例太简单了，要弄一个复杂对象的转换
    public static <T, R> List<R> convertMap(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(f.apply(t));
        }
        return result;
    }

    public static void main(String[] args) {
//        List<String> arrays = Arrays.asList("lambdas", "in", "action");
//        List<Integer> result = convertMap(arrays, ((String item) -> item.length()));
//        System.out.printf(result.toString());

//        List<String> l = new ArrayList<>();
      try{
          throw new RuntimeException("a");
      }catch (Exception e){
          throw e;
      }finally {
          throw new RuntimeException("b");
      }
    }

    public static void test(List<Object> param){
        System.out.printf("ooo");
    }


}
