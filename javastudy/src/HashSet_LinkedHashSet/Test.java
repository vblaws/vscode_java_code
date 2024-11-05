package HashSet_LinkedHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("12");
        set.add("13");
        set.add("14");
        set.add("15");
        boolean result = set.add("15");
        System.out.println("重复添加会导致:" + result);
        //迭代器方式遍历
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
        //增强for
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println();


        //Lambda表达式
        set.forEach(x -> System.out.println(x));
        System.out.println(set);
        Object o = new Object();
        int a = o.hashCode();
        System.out.println(a);
    }
}
