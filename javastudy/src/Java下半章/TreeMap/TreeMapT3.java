package Java下半章.TreeMap;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class TreeMapT3 {
    public static void main(String[] args) {
        String str = "aabbccddesioadfhjasldfhasfeuahsfkjdfhasiufhesae";
        //统计一个字符出现的次数
        //新的统计思想
        //如果不需要排序:HashMap
        //需要排序:TreeMap
        //计数器思想
        TreeMap<Character, Integer> treeMap = new TreeMap<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o2 - o1;
            }
        }
        );
        for (int j = 0; j < str.length(); j++) {
            char key = str.charAt(j);
            if (treeMap.containsKey(key)) {
                int value = treeMap.get(key);
                value++;
                treeMap.put(key, value);
            } else {
                treeMap.put(key, 1);
            }
        }
        treeMap.forEach((x, y) -> System.out.print(x + "(" + y + ")" + " \n"));
        treeMap.forEach(new BiConsumer<Character, Integer>() {
            @Override
            public void accept(Character character, Integer integer) {
                System.out.println(character + ":" + integer);
            }
        });

    }
}
