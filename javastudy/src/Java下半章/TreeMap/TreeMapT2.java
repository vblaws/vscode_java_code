package Java下半章.TreeMap;

import java.util.TreeMap;

public class TreeMapT2 {
    public static void main(String[] args) {
        TreeMap<Student, String> treeMap = new TreeMap<>();
        treeMap.put(new Student("王五", 12), "江苏");
        treeMap.put(new Student("李四", 14), "北极");
        treeMap.put(new Student("张三", 15), "北京");
        treeMap.put(new Student("王五", 12), "江苏");
        treeMap.forEach((x, y) -> System.out.println(x + " " + y));
    }
}
