package 可变参数_Collections_综合练习.综合练习;

import java.util.*;

public class T1 {
    public static final int MAN = 1;
    //    public static final int WOMAN = 0;
    static Random r = new Random();


    public static void main(String[] args) {
        //随机点名1.0
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Marry", "Cindy", "Mike", "Trump", "Elon Mask");
        System.out.println(list.get(r.nextInt(list.size())));
        //随机点名2.0,Man 70% Woman 30%
        ArrayList<Integer> list1 = new ArrayList<>();
        //设置几率
        Collections.addAll(list1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0);
        //打乱
        Collections.shuffle(list1);
//        System.out.println(list1);

        //添加集合元素
        ArrayList<String> manList = new ArrayList<>();
        Collections.addAll(manList, "也门", "Mike", "Dick", "qiqi", "ii", "aa", "aav");
        ArrayList<String> girlList = new ArrayList<>();
        Collections.addAll(girlList, "妮妮", "赫赫", "基极");


        int result = list1.get(r.nextInt(list1.size()));
        System.out.println(result);
        if (result == MAN) {
            int index = r.nextInt(manList.size());
            System.out.println(manList.get(index));
        } else {
            int index = r.nextInt(girlList.size());
            System.out.println(girlList.get(index));
        }
        //练习3，有x名学生,被点到的不会再被点到，如果点完就进行第二轮
        //定义集合
        {
            for (int j = 0; j < 5; j++) {
                System.out.println("=====================第" + j + "轮开始了======================");
                ArrayList<String> oldStudent = new ArrayList<>();
                ArrayList<String> newStudent = new ArrayList<>();
                //添加数据
                Collections.addAll(oldStudent, "s1", "s2", "s3", "s4", "s5", "s6", "s7");
                //随机点名
                while (!oldStudent.isEmpty()) {
                    //如果remove方法是通过索引删除的，将会返回泛型中定义的数据类型
                    //将被删除的元素添加到新的集合中
                    newStudent.add(oldStudent.remove(r.nextInt(oldStudent.size()))); //删除一个元素,范围是oldStudent的长度,返回删除的元素
                    //每点到一个就删除一个,
                }
                //将new里面的所有东西添加到old里面,上面那个循环就是随机抽取的行为
                oldStudent.addAll(newStudent);
                System.out.println(oldStudent);
                //再将new里面的东西清除
                newStudent.clear();
            }
            //练习4-5由于涉及IO,权重随机算法,所以等到之后学会了再回来做
            //练习6--集合嵌套
            {
                /*
                图中的文字内容是一个关于Map集合的案例，需求如下：

                定义一个Map集合，键用表示省份名称（province），值表示市（city），但是市会有多个。添加完毕后，遍历结果格式如下：

                江苏省 = 南京市，扬州市，苏州市，无锡市，常州市
                    湖北省 = 武汉市，孝感市，十堰市，宜昌市，鄂州市
                    河北省 = 石家庄市，唐山市，邢台市，保定市，张家口市
                */
                //创建集合
                HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
                ArrayList<String> JiangSu = new ArrayList<>();
                Collections.addAll(JiangSu,"江阴","苏州","淮安");
                ArrayList<String> GuangZhou = new ArrayList<>();
                Collections.addAll(GuangZhou,"g1","g2","g3");
                ArrayList<String> BeiJing = new ArrayList<>();
                Collections.addAll(BeiJing,"B1","B2","B3");

                hashMap.put("苏州省", JiangSu);
                hashMap.put("广州省",GuangZhou);
                hashMap.put("北京省",BeiJing);
                //方式1
                hashMap.forEach((x,y)-> System.out.println(x+"="+y));
                //方式2
                Set<Map.Entry<String,ArrayList<String>>> entries =  hashMap.entrySet();
                for (Map.Entry<String, ArrayList<String>> entry : entries) {
                    String key = entry.getKey();
                    StringJoiner stringJoiner = new StringJoiner(",","","");
                    for (String s : entry.getValue()) {
                        stringJoiner.add(s);
                    }
                    System.out.println(key+"="+stringJoiner);
                }


            }

        }
    }
}
