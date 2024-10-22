package Java下半章.HashMapTest2;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        // 存储四个选项
        String[] arr = { "A", "B", "C", "D" };
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        Map<String, Integer> map = new HashMap<>();
        // 存储80个人的投票结果
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(4);
            System.out.println(index);
            list.add(arr[index]);
        }
        // 投票环节，如果存在就+1如果不存在就添加到map集合中
        for (String string : list) {
            System.out.println(string);
            if (map.containsKey(string)) {
                // 存在
                int count = map.get(string);
                count++;
                map.put(string, count);
            } else {
                // 不存在
                map.put(string, 1);
            }
        }
        map.forEach((x, y) -> System.out.println(x + " " + y));
        // 比较大小
        Set<Map.Entry<String, Integer>> setEnt = map.entrySet();
        int max = 0;
        String place = "";
        for (Map.Entry<String, Integer> entry : setEnt) {
            if (entry.getValue() > max) {
                place = entry.getKey();
                max = entry.getValue();
            }
        }
        System.out.println("最多人想去的景点是" + place + "\n人数为" + max + "人");
        SendMessage sendMessage = message -> System.out.println(message);
        sendMessage.sayMessage("你个人机");
        // sendMessage.doSomething();
    }
}
