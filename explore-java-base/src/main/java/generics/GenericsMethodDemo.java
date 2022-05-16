package generics;


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


    }
}
