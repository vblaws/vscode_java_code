package 可变参数_Collections_综合练习.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
//传入实现Collection接口的类
//| `public static <T> boolean addAll(Collection<T> c, T... elements)` |          批量添加元素          |
        ArrayList<String> collection = new ArrayList<>();
        Collections.addAll(collection,"12","22","33","34","44","555");
        collection.forEach(System.out::println);
        System.out.println("---------------------");
        //需要传入List的实现类
//| `public static void shuffle(List<?> list)`             |      打乱List集合元素的顺序       |
        Collections.shuffle(collection);
        collection.forEach(System.out::println);
    }
}
