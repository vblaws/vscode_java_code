package MyList;

import java.util.ArrayList;
import java.util.List;

public class MyListDemo {
    public static void main(String[] args) {
        /*
         * |
         * | ----------------------------- | ----------------------------------- |
         * | void add(int index,E element) | 在集合中指定位置插入指定元素 |
         * | E remove(int index) | 删除指定位置的元素,返回被删除的元素 |
         * | E set(int index,E element) | 修改索引处的元素,返回被修改的元素 |
         * | E get(int index) | 返回指定索引处的元素 |
         * 
         */
        List<String> list = new ArrayList<>();
        // 添加元素
        list.add("a");
        list.add("b");
        list.add("h");
        System.out.println(list);
        // 在指定位置添加元素,如果当前位置没有元素,则插入,如果当前索引有元素,则将其他元素向后移
        list.add(1, "c");
        // 删除元素
        /*
         * 调用方法时,如果方法出现重载方法
         * 优先调用形参和实参相同的
         */
        String str = list.remove(1);
        System.out.println(str);
        // 修改元素
        String str1 = list.set(1, "b");
        System.out.println(str1);
        // 遍历元素
        System.out.println(list);
    }
}
