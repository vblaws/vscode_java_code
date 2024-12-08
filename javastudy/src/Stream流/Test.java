package Stream流;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("宋小宝");
        list.add("王雷");
        list.add("张强");
        list.add("张三丰");
        //新的集合
        ArrayList<String> list2 = new ArrayList<>();
        //原来的方法
        //以张开头的人添加到新数组中
        for (String name : list) {
            if (name.startsWith("张")){
                list2.add(name);
            }
        }
        System.out.println(list2);
        //将以张开头且长度大于2的添加到新数组中
        ArrayList<String> list3 = new ArrayList<>();
        for (String name : list2) {
            if (name.length() >=3){
                list3.add(name);
            }
        }
        System.out.println(list3);


        //Stream效果
        list.stream().filter(name-> name.startsWith("张")).filter(name->name.length()==3).forEach(System.out::println);



    }
}
