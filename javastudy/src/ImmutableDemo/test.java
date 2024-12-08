package ImmutableDemo;
/**
 * Immutable不可变的
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        //一旦创建完毕，只能查询，不能修改或者删除JDK9才支持
        List<Integer> list = List.of(1,2,3,4,5,6,6);
        list.forEach(System.out::println);
        //当我们要获取一个不可变的Set集合时，里面的参数要保证唯一性
//        Set<String> set = Set.of("a","b","v","b");
//        for (String s : set) {
//            System.out.println(s);
//        }
        //创建Map的不可变集合
//        Map<String,Integer> = Map.of(...);
        //最多20个参数，10个键值对
        //键不可以重复



        //如果要传入大于10个键值对对象，可以调用Map.ofEntries方法,可以传入很多entries对象
        HashMap<String,String> map = new HashMap<>();
        map.put("猴头", "孙悟空");
        map.put("老猪", "猪八戒");
        map.put("沙师弟", "沙悟净");
        //接收到所有的键值对对象(Entry对象)
        Set<Map.Entry<String, String>> entries = map.entrySet();
        //把entries变成一个数组传入Map.ofEntries
        //toArray方法底层会比较集合的长度和传入的数组长度
        //若集合长度大于数组长度，将会根据实际数据的个数创建新的数组
        //若集合长度小于数组长度，则会直接添加进去
        Map.Entry[] array = entries.toArray(new Map.Entry[10]);
        //不可变集合Map1
//        Map map1 = Map.ofEntries(array);
//        一行解决的方式
        //Map.ofEntries参数为Entries<K,V> entries,所以传入一个数组也是可以的
        Map<Object, Object> objectObjectMap = Map.ofEntries(map.entrySet().toArray(new Map.Entry[0]));
        objectObjectMap.forEach((x,y)-> System.out.println(x+"="+y));
        //还有一个更加简洁的方式,如果本身为不可变集合则直接返回，如果不是则会返回不可变集合
        //since JDK10
        Map<String, String> stringStringMap = Map.copyOf(map);
        stringStringMap.put("a","a");
//        xception in thread "main" java.lang.UnsupportedOperationException

    }
}
