package Stream流;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {

        /*
        | `Stream<T> distinct()`                            | 元素去重，依赖(hashCode和equals方法) |
        | ------------------------------------------------- | ------------------------------------ |
        | `static <T> Stream<T> concat(Stream a, Stream b)` | 合并a和b两个流为一个流               |
         */

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "张无忌", "张无忌","张无忌", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");
        list1.stream()
                // Set<T> keys = map.keySet();
                //                    if (seenNull.get()) {
                //                        // TODO Implement a more efficient set-union view, rather than copying
                //                        keys = new HashSet<>(keys);
                //                        keys.add(null);
                //                    }
                //底层使用HashSet去重的
                .distinct()
                .forEach(System.out::println);
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "周芷若", "赵敏");
        //合并流
        System.out.println("====合并后====");
        Stream.concat(list1.stream(),list2.stream())
                .forEach(System.out::println);

    }
}
