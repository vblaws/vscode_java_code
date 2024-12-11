package Stream流.StreamTest;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class T1 {
    public static void main(String[] args) {
        //存储1-10,过滤奇数，只保留偶数
        System.out.println("Test1");
        ArrayList<Integer> t1 = new ArrayList<>();
        Collections.addAll(t1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Set<Integer> collect = t1.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println(collect);
        //保留年龄大于24，并将结果保存在map集合中
        System.out.println("Test2");
        ArrayList<String> t2 = new ArrayList<>();
        Collections.addAll(t2, "zhangsan,23", "lisi,24", "wangwu,25");
        Map<String, Integer> collect1 = t2.stream()
                .filter(c -> Integer.parseInt(c.split(",")[1]) >= 24)
                .collect(Collectors.toMap(
                        key -> key.split(",")[0],
                        value -> Integer.parseInt(value.split(",")[1])
                ));
        System.out.println(collect1);
        //自定义集合Actor,
        //属性name,age
        //具体见typora
        System.out.println("Test3");
//        ArrayList<Actor> t3_B = new ArrayList<>();
//        Collections.addAll(t3_B,
//                new Actor("张三",23),
//                new Actor("李四",24),
//                new Actor("嘻哈",11),
//                new Actor("黎明",60),
//                new Actor("徐有",22),
//                new Actor("你哈",2));
//        ArrayList<Actor> t3_G = new ArrayList<>();
//        Collections.addAll(t3_G,
//                new Actor("小梅",23),
//                new Actor("小妹",24),
//                new Actor("小兰花",11),
//                new Actor("小美",60),
//                new Actor("徐徐",22),
//                new Actor("阿阿",2));
        ArrayList<String> t3_B = new ArrayList<>();
        Collections.addAll(t3_B, "张三,23",
                "李四a,24",
                "嘻哈b,11",
                "黎明c,60",
                "徐有,22",
                "你哈,2"
        );
        ArrayList<String> t3_G = new ArrayList<>();
        Collections.addAll(t3_G,
                "杨梅,23",
                "杨妹,24",
                "小兰花,11",
                "杨美,60",
                "徐徐,22",
                "阿阿,2"
        );
        //1
        Stream<String> streamBoy = t3_B.stream()
                .limit(2)
                .filter(str -> str.split(",")[0].length() == 3);
        //2
        Stream<String> streamGirl = t3_G.stream()
                .skip(1)
                .filter(str -> str.split(",")[0].startsWith("杨"));
        //3
        Stream<String> concat = Stream.concat(streamBoy, streamGirl);
        //4
        Stream<Actor> actorStream = concat.map(actor -> new Actor(actor.split(",")[0], Integer.parseInt(actor.split(",")[1])));
        //5
        List<Actor> list = actorStream.toList();
        System.out.println(list);
//        一次性写完
        List<Actor> list1 = Stream.concat(t3_B.stream()
                        .limit(2)
                        .filter(str -> str.split(",")[0].length() == 3)
                , t3_G.stream()
                        .skip(1)
                        .filter(name -> name.split(",")[0].startsWith("杨"))
        ).map(actor -> new Actor(actor.split(",")[0], Integer.parseInt(actor.split(",")[1]))).toList();
        System.out.println(list1);
    }
}
