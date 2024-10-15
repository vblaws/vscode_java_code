package Java下半章.Map常见APT;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

public class MapFor {
    public static void main(String[] args) {
        // 第一种遍历方式键找值
        Map<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        // keyset方法可以把一个map集合的键变成一个单列集合
        Set<String> keys = map.keySet();
        // 遍历单列集合
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key + "+" + value);
        }
        // 键找值练习2
        Iterator<String> iter = keys.iterator();
        while (iter.hasNext()) {
            System.out.println(map.get(iter.next()));
        }
        // 键找值3
        keys.forEach(key -> System.out.println(key + "" + map.get(key)));
        Supplier<Integer> random = () -> (int) (Math.random() * 100);
        Supplier<Integer> random2 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * 100);

            }

        };
        System.out.println(random.get());
        System.out.println(random2.get());
    }
}
