package Stream流.midMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
        /*
        | 获取方式     | 方法名                                          | 说明                     |
        | ------------ | ----------------------------------------------- | ------------------------ |
        | 单列集合     | `default Stream<E> stream()`                    | Collection中的默认方法   |
        | 双列集合     | 无                                              | 无法直接使用stream流     |
        | 数组         | `public static <T> Stream<T> stream(T[] array)` | Arrays工具类中的静态方法 |
        | 一堆零散数据 | `public static<T> Stream<T> of(T... values)`    | Stream接口中的静态方法   |
         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","e","f");
        //获取一条Stream流,并把数据放在流水线上
        Stream<String> stream = list.stream();
        //使用终结方法打印
         stream.forEach(s -> System.out.println(s));

    }
}
