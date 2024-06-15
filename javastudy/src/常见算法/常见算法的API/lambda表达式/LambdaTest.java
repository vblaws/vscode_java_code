package 常见算法.常见算法的API.lambda表达式;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaTest {
    public static void main(String[] args) {
        /*
         * Lambda表达式简化Comparator接口的匿名形式
         * 定义一个数组存储字符串.利用Arrays里里面的sort方法惊喜进行排序
         * 要求:按照字符串长度怕排序，短的在前面,长的在后面
         */

        String[] arr = { "hello", "world", "Mike", "Java", "C" };
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }

        });
        /*
         * lambda省略规则：参数类型可以省略不写
         * 如果只有一个参数,参数类型可以省略,同时()也可以省略
         * 如果lambda方法体只有一行,大括号，分号，return也可以省略不写.需要同时省略
         */
        Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());
        System.out.println(Arrays.toString(arr));
    }
}
