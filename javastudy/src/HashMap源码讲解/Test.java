package HashMap源码讲解;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        //public V put(K key, V value) {
        //        return putVal(hash(key), key, value, false, true);
        //    }
        //因为会返回被覆盖的健的值
        //因为没有被覆盖,所以这里返回null
        System.out.println("没有被覆盖，返回"+hashMap.put("a", 12));
        //被覆盖返回
        System.out.println("被覆盖,返回"+hashMap.put("a",13));
        System.out.println(hashMap);
    }
}
