package Stream流.finalMethod;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        //collect(Collector collector)收集流中的数据，放到集合中
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-男-12", "张无忌-男-12", "张强-男-11", "张三丰-男-20", "张翠山-女-33", "张良-男-22", "王二麻子-女-20", "谢广坤-男-90");

        //收到List集合里面
        //把所有男性收集到List
        List<String> list1 = list.stream()
                .filter(name -> name.split("-")[1].equals("男"))
                .collect(Collectors.toList());
//                .forEach(x-> System.out.println(x));
        System.out.println(list1);

        //收集到Set集合里面
        Set<String> collect = list.stream()
                .filter(name -> "男".equals(name.split("-")[1]))
                .collect(Collectors.toSet());
        System.out.println(collect);


        //收到map集合里面
        //所有男性收集起来
        //键:姓名,值:年龄
        Map<String, Integer> collect1 = list.stream()
                .filter(name -> "男".equals(name.split("-")[1]))
                .distinct()
                /*
                toMap详细解释:
                参数一:键的生成规则
                参数二:值的生成规则

                参数一
                    Function泛型1:表示流中每一个数据的类型
                            泛型2:表示map集合中键的类型
                    方法apply形参:一次表示流中的每一个数据
                            方法体:生成键的代码
                            返回值:已经生成的键
                 参数二
                    Function泛型1:表示流中每一个数据的类型
                            泛型2:表示map集合中值的类型
                     方法apply形参:一次表示流中的每一个数据
                            方法体:生成值的代码
                            返回值:已经生成的值

                   !!!注意点:如果要添加到Map集合当中,必须要保持键是唯一的
                 */
                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    //key
                    public String apply(String s) {
                        return s.split("-")[0];
                    }
                    //value
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split("-")[2]);
                    }
                }));

        System.out.println(collect1);
        //Lambda形式
        Map<String, Integer> collect2 = list.stream()
                .filter(name -> "男".equals(name.split("-")[1]))
                .distinct()
                .collect(Collectors.toMap(
                        key -> key.split("-")[0],
                        value -> Integer.parseInt(value.split("-")[2])));
        System.out.println(collect2);
        Stream<String> stream = list.stream();

    }
}
