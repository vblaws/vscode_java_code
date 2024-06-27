package Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class IteratorDemoFor {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("adad");
        coll.add("adaawd1");
        coll.add("adaw");
        // for (String string : coll) {
        // System.out.println(string);
        // }
        // 匿名内部类形式
        coll.forEach(new Consumer<String>() {
            // t表示其中的每一个元素
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        });

        // Lambda遍历:default void forEach(Consumer <? extends T> action):
        coll.forEach(t -> System.out.println(t));
        /*
         * forEach底层原理
         * 其实也会自己遍历集合,依次得到每一个元素
         * 把得到的每一个元素,一次传递给accept方法
         * s代表集合中的每一个元素
         * 
         * 
         */

    }
}
