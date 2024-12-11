package Stream流.finalMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.IntFunction;

public class StreamDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "张无忌","张无忌", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");
        list.stream().forEach(x-> System.out.println(x));
        System.out.println(list.stream().count());

        //InFunction泛型：具体类型的数组
        //apply，流中数据的个数，需要跟数组长度一直
        //方法体：创建数组
        //toArray的作用：创建一个指定类型的数组
        String[] array = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        for (String s : array) {
            System.out.println(s);
        }
        //Lambda
        String[] array1 = list.stream()
                .toArray(value -> new String[value]);
        for (String s : array1) {
            System.out.println(s);
        }
    }
}
