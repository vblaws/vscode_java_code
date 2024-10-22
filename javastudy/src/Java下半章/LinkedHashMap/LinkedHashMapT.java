package Java下半章.LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapT {
    public static void main(String[] args) {
        // LinkedHashMap测试
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("a", 1);
        linkedHashMap.put("b", 2);
        linkedHashMap.put("c", 3);
        linkedHashMap.forEach((x, y) -> System.out.println(x + "=" + y));
    }
}
