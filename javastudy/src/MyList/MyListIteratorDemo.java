package MyList;

import java.util.*;

public class MyListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("B");
        list.add("null");
        list.add("ada");
        // ListIterator,索引从零开始
        ListIterator<String> lt = list.listIterator();
        while (lt.hasNext()) {
            String str = lt.next();
            if ("a".equals(str)) {
                lt.add("我前面一个是a");
            }
        }
        System.out.println(list);

        System.out.println("-----------------------------");
        // while (lt.hasPrevious()) {
        // System.out.println(lt.previous());
        // }
    }
}