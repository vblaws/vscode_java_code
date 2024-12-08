package Stream流;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class StreamDemo5 {
    public static void main(String[] args) {
        /*
        Stream中间方法:
       | 名称                                                   | 说明                                       |
|--------------------------------------------------------|--------------------------------------------|
| `Stream<T> filter(Predicate<? super T> predicate)`     | 过滤                                       |
| `Stream<T> limit(long maxSize)`                        | 获取前几个元素                             |
| `Stream<T> skip(long n)`                               | 跳过前几个元素                             |
| `Stream<T> distinct()`                                 | 元素去重，依赖(hashCode和equals方法)       |
| `static <T> Stream<T> concat(Stream a, Stream b)`      | 合并a和b两个流为一个流                     |
| `Stream<R> map(Function<T, R> mapper)`                 | 转换流中的数据类型                         |
         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵明", "张强", "张三丰", "张翠花", "张良");
        //Lambda
        list.stream().filter(name -> name.startsWith("张")).forEach(x -> System.out.println(x));
        //匿名函数
        list.stream().filter(new Predicate<String>() {
            @Override
            //s代表每一个元素
            public boolean test(String s) {
                //如果为true就保留，如果是false就去掉
                return s.startsWith("张");
            }
        }).forEach(x -> System.out.printf(x + ""));
        //推荐使用这种方式,简洁易懂
        list.stream()
                .filter(name -> name.startsWith("张"))
                .filter(name -> name.length() == 3)
                .forEach(System.out::println);
        System.out.println("===========Limit===========");
        //limit(获取前几个元素)和skip(跳过前几个元素)
        list.stream()
                .limit(2)
                .forEach(System.out::println);
        System.out.println("========skip=========");
        list.stream()
                .skip(2)
                .forEach(System.out::println);
        //Test "张强", "张三丰", "张翠花"
        System.out.println("==============T1===================");
        //先获取前六个跳过前三个
        list.stream()
                .limit(6)
                .skip(3)
                .filter(name->name.startsWith("张"))
                .forEach(System.out::println);
        //跳过前三个，再获取三个
        System.out.println("T2");
        list.stream()
                .skip(3)
                .limit(3)
                .filter(name->name.startsWith("张"))
                .forEach(System.out::println);
    }
}
