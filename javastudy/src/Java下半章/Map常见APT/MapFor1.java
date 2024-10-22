package Java下半章.Map常见APT;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;

public class MapFor1 {
    public static void main(String[] args) {
        // Map集合第二种遍历方式

        // 1.创建map集合的对象
        Map<String, String> map = new HashMap<>();
        // 2.添加元素
        map.put("猴头", "孙悟空");
        map.put("老猪", "猪八戒");
        map.put("沙师弟", "沙悟净");
        // 3。遍历（通过键值对对象遍历）
        // 3.1通过一个方法获取所有的键值对对象
        Set<Entry<String, String>> result = map.entrySet();
        // 遍历Entry集合,增强for方法
        for (Entry<String, String> entry : result) {// entry --> "猴头","孙悟空"
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();
        // 遍历Entry集合，迭代器方式
        Set<Entry<String, String>> result1 = map.entrySet();
        Iterator<Entry<String, String>> iterator = result1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(" ");
        // 遍历Entry方式,Lambda表达式
        Set<Entry<String, String>> result2 = map.entrySet();
        result2.forEach(x -> System.out.println(x.getKey() + "=" + x.getValue()));
    }
}
