package 常见算法.五道算法题.T1;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        /*
         * 题目介绍:
         * 定义数组并且存储一些女朋友对象,利用Arrays中的sort排序
         * 要求1:属性要有姓名,年龄,身高
         * 要求2:按照年龄大小排序,年龄一样,按身高来排,身高一样,按字母顺序排
         * 姓名中不能出现中文或者特殊字符,会涉及到后面的知识
         */
        String d = "dac";
        String c = "da";
        int i = d.compareTo(c);
        System.out.println(i);
        GirlFriend[] girlArr = { new GirlFriend("wb", 20, 170), new GirlFriend("wa", 20, 160),
                new GirlFriend("wc", 20, 170), new GirlFriend("wx", 10, 160) };

        // 利用Arrays中的sort排序,匿名内部类
        Arrays.sort(girlArr, new Comparator<GirlFriend>() {
            @Override
            public int compare(GirlFriend o1, GirlFriend o2) {
                // 要求2:按照年龄大小排序,年龄一样,按身高来排,身高一样,按字母顺序排
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
                if (temp > 0) {
                    return 1;
                } else if (temp < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        // lambda形式
        Arrays.sort(girlArr, (o1, o2) -> {
            double temp = o1.getAge() - o2.getAge();
            temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
            temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
            if (temp > 0) {
                return 1;
            } else if (temp < 0) {
                return -1;
            } else {
                return 0;
            }
        });
        for (GirlFriend girlFriend : girlArr) {
            System.out.println(girlFriend.toString());
        }
    }
}
