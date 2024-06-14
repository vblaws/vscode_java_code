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