package Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo2 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("ccc");
        coll.add("bbb");
        coll.add("qqq");
        coll.add("lll");
        coll.add("iis");
        Iterator<String> it = coll.iterator();
        while (it.hasNext()) {

            // 错误的方式
            /*
             * if ("aaa".equals(str)) {
             * coll.remove("aaa");
             * }
             */
            // 这里如果要删除,需要使用迭代器的删除方法

            System.out.println(it.next());

        }
    }
}
