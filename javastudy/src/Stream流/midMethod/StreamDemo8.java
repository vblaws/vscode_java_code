package Stream流.midMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class StreamDemo8 {
    public static void main(String[] args) {
//        `Stream<R> map(Function<T, R> mapper)`转换流中的数据类型
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三-13","李四-14","刘星-20");
        //需求：只获取并打印其中的年龄
        //apply形参s,集合中的每一个数据
        //返回值：转换之后的数据
        list.stream()
                //泛型里面不能写基本数据类型
                .map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s.substring(3));
            }
        })
                .forEach(x-> System.out.println(x));
        //匿名内部类形式
        list.stream()
                .map(str->Integer.parseInt(str.substring(3)))
                .forEach(x-> System.out.println(x));
    }
}
