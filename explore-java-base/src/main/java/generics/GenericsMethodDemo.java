package generics;


import java.util.ArrayList;
import java.util.List;

/**
 * 泛型方法
 *
 * @author 314654925@qq.com
 * @date 2022/5/16 9:19 PM
 */
public class GenericsMethodDemo {

    /**
     * 泛型方法
     */
    public static <E> void printArrays(E[] arrays) {
        for (E e : arrays) {
            System.out.println(e);
        }
    }

    /**
     * 有界参数 泛型方法
     *
     * @return max
     */
    public static <T extends Comparable<T>> T maxMun(T t, T y, T z) {
        T max = t;
        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    /**
     * 类型通配符一般是使用 ? 代替具体的类型参数,是所有具体类型实参的父类
     */
    public static void getData(List<?> data) {
        System.out.println("data :" + data.get(0));
    }

    /**
     * 型通配符下限通过形如 List<? super Number> 来定义，表示类型只能接受 Number 及其上层父类类型，如 Object 类型的实例
     * @param data
     */
    public static void getUpperNumber(List<? extends Number> data) {
        System.out.println("data :" + data.get(0));
    }

    public static void main(String[] args) {
        Integer[] arrays = new Integer[]{1, 2, 3, 4, 5};
        printArrays(arrays);

        String[] arrays1 = new String[]{"a", "b", "c"};
        printArrays(arrays1);

        System.out.println(maxMun(1, 2, 3));
        System.out.println(maxMun("a", "b", "c"));

        //generics class demo
        GenericsClassDemo<Integer> generics1 = new GenericsClassDemo<>(1);

        GenericsClassDemo<String> generics2 = new GenericsClassDemo<>("code123");

        System.out.println(generics1);
        System.out.println(generics2);

        List<String> name = new ArrayList<>();
        List<Integer> age = new ArrayList<>();
        List<Number> number = new ArrayList<>();

        name.add("icon");
        age.add(18);
        number.add(314);

        getData(name);
        getData(age);
        getData(number);

        //1 因为 getUpperNumber() 方法中的参数已经限定了参数泛型上限为 Number，所以泛型为 String 是不在这个范围之内，所以会报错
        //getUpperNumber(name);
        getUpperNumber(age);//2
        getUpperNumber(number);//3
    }
}
