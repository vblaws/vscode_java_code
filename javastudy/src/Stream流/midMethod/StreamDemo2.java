package Stream流.midMethod;

import java.util.HashMap;

public class StreamDemo2 {
    public static void main(String[] args) {
//         | 双列集合     | 无                                              | 无法直接使用stream流     |

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("a", 1);
        hm.put("b", 2);
        hm.put("c", 3);
        hm.put("d", 4);
        hm.put("e", 5);
        hm.keySet().stream().forEach(x-> System.out.println(x+hm.get(x)));
        hm.entrySet().stream().forEach(x-> System.out.println("key="+x.getKey()+"\tValue="+x.getValue()));

    }
}
