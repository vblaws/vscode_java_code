package Java下半章.Map常见APT;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.BiConsumer;

public class MapFor2 {
    public static <T> void main(String[] args) {
        // 第三种遍历方式,Lambda方式

        // 1.创建map集合的对象
        Map<String, String> map = new HashMap<>();
        // 2.添加元素
        map.put("猴头", "孙悟空");
        map.put("老猪", "猪八戒");
        map.put("沙师弟", "沙悟净");
        // Set<Entry<String, String>> result = map.entrySet();
        // 底层：使用了第二种遍历方式，遍历一次获得每一个键和值
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String k, String v) {
                System.out.println(k + "=" + v);
            }

        });
        map.forEach((k, y) -> System.out.println(k + "=" + y));
    }
}
