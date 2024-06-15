package 常见算法.常见算法的API.lambda表达式;

import java.util.*;

public class LambdaDemo {
    public static void main(String[] args) {
        // 原来的方式
        // 调用一个方法,如果形参是一个接口,那么我们需要传入这个接口的实现类对象
        // 如果方法只需要调用一次,那么可以使用匿名内部类
        method(
                new Swim() {
                    @Override
                    public void Swimimng() {
                        System.out.println("我在匿名内部类里面写");
                    }
                });

        // 利用Lambda表达式的方式
        method(() -> {
            System.out.println("我在Lambda里面写");
        });
        /*
         * lambda省略规则：参数类型可以省略不写
         * 如果只有一个参数,参数类型可以省略,同时()也可以省略
         * 如果lambda方法体只有一行,大括号，分号，return也可以省略不写.需要同时省略
         */
        Integer[] arr = { 1, 2, 3, 1, 22, 2, 22, 1, 111, 112 };
        // 省略前
        Arrays.sort(arr, (Integer o1, Integer o2) -> {
            return o2 - o1;
        });
        // 省略后
        Arrays.sort(arr, (o1, o2) -> o1 - o2);

        System.out.println(Arrays.toString(arr));
        // 上面一段的简单理解:
        // o1-o2升序 // o2-o1降序

    }

    public static void method(Swim s) {
        s.Swimimng();
    }
}

/**
 * Swim
 * 
 */
// 函数式接口:有且只有一个抽象方法的接口

@FunctionalInterface
interface Swim {
    void Swimimng();
}