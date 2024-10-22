package Java下半章.HashMapTest.Test1;

import java.util.HashMap;

public class Test1 {
    public static void main(String[] args) {

        HashMap<Student, String> map = new HashMap<>();
        map.put(new Student("wangsan", 12), "jiangsu");
        map.put(new Student("wangsi", 11), "beijing");
        map.put(new Student("wangsan", 12), "nanjing");
        map.forEach((x, y) -> System.out.println(x + "=" + y));
    }
}
