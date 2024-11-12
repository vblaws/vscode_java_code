package Java下半章.TreeMap;

import java.util.TreeMap;

public class TreeMapT1 {
    public static void main(String[] args) {
        //Integer,Double类型默认按升序排列
        //String类时按照ASCII码表对应数字排序
        //升序
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "矿泉水");
        treeMap.put(4, "手机");
        treeMap.put(2, "鼠标");
        treeMap.put(3, "显示器");
        treeMap.forEach((x, y) -> System.out.println(x + " " + y));
        System.out.println("------------------");
        //降序
        //o1:要存储的元素
        //o2:已经存在的元素
        TreeMap<Integer, String> treeMap1 = new TreeMap<>((o1, o2) -> o2 - o1);
        treeMap1.put(1, "矿泉水");
        treeMap1.put(4, "手机");
        treeMap1.put(2, "鼠标");
        treeMap1.put(3, "显示器");
        treeMap1.forEach((x, y) -> System.out.println(x + " " + y));

    }
}
