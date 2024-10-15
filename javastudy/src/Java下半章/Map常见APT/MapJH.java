package Java下半章.Map常见APT;

import java.util.HashMap;
import java.util.Map;

/*
 * 方法名称	说明
V put(K key, V value)	添加元素
V remove(Object key)	根据键删除键值对元素
void clear()	移除所有的键值对元素
boolean containsKey(Object key)	判断集合是否包含指定的键
boolean containsValue(Object value)	判断集合是否包含指定的值
boolean isEmpty()	判断集合是否为空
int size()	集合的长度，也就是集合中键值对的个数
 */
public class MapJH {
    public static void main(String[] args) {
        // 创建Map集合的对象
        Map<String, String> list = new HashMap<>();
        // 添加元素
        // put方法细节
        // 添加/覆盖
        // 在添加数据时，如果键不存在，则直接把键值对添加到map集合中,并且方法返回null
        // 在添加数据时，若键已存在，会把原有的键值对对象覆盖，会把被覆盖的值返回

        list.put("1", "a");
        // System.out.println(value1);
        list.put("2", "b");
        list.put("3", "c");

        // String value = list.put("1", "d");
        // System.out.println(value);
        // 会返回删除key的value
        String result = list.remove("1");
        System.out.println(result);
        // 清空map无返回值
        // list.clear();
        // 查看是否包含
        boolean re = list.containsKey("2");
        System.out.println(re);
        boolean re1 = list.containsValue("b");
        System.out.println(re1);
        // 打印出来
        System.out.println(list);

    }
}
