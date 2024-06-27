package Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        /*
         * | 方法名 | 说明 |
         * | ---------------------- | -------------------------------------- |
         * | Iterator<E> iterator() | 返回迭代器对象,默认指向当前集合的0索引 |
         * | boolean hasNext() | 判断当前位置是否有元素,有元素返回true,没有元素返回false |
         * | E next() | 获取当前位置的元素,并将迭代器对象移动到下一个位置 |
         */
        String str = "Hello,world";
        Collection<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(new String(new char[] { str.charAt(i) }));
        }
        // 获取迭代器对象,默认指向0索引处
        Iterator<String> iterator = list.iterator();
        // 判断当前位置是否有元素,有元素返回true,没有元素返回false |
        while (iterator.hasNext()) {
            // 获取当前位置的元素,并将迭代器对象移动到下一个位置
            System.out.println(iterator.next());
        }
        // 细节注意点:
        // 1.报错NoSuchElementException
        // 2.迭代器遍历完毕,指针不会复位
        // 3.循环中只能使用一次next方法
        // 4.迭代器遍历时,不能使用集合的方法进行增加或删除
        // 如果要进行第二次遍历集合,就需要重新获取迭代器对象

    }

}
