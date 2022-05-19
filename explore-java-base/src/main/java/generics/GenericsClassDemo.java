package generics;

/**
 * 泛型类 Demo
 * java 中泛型标记符：
 *
 * E Element (在集合中使用，因为集合中存放的是元素)
 * T Type（Java 类）
 * K Key（键）
 * V Value（值）
 * N Number（数值类型）
 * ? 表示不确定的 java 类型
 *
 * @author 314654925@qq.com
 * @date 2022/5/16 9:34 PM
 */
public class GenericsClassDemo<T> {
    private T t;

    public GenericsClassDemo(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "GenericsClassDemo{" +
            "t=" + t +
            '}';
    }
}
