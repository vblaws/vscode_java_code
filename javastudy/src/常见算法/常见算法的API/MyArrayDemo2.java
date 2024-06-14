package 常见算法.常见算法的API;

import java.util.Arrays;
import java.util.Comparator;

public class MyArrayDemo2 {
    public static void main(String[] args) {
        /*
         * public static void sort(数组,排序规则)
         * 细节:只能对引用数据类型排序
         * 如果是基本数据类型,那就需要变成对应的包装了
         */

        Integer[] arr = { 1, 2, 3, 1, 22, 2, 22, 1, 111, 112 };
        // 第二个参数是一个接口,我们在调用方法时,需要传递一个这个接口的实现类对象,作为排序的规则
        // 但是这个实现类,我只需要使用一次,所以就没必要专门写一个类,所以直接采取匿名内部类
        // 底层原理:
        // 利用插入排序和二分查找的方式进行排序
        // 默认把0索引的数据当做有序的,1到最后都是无序的
        // 遍历无序的序列得到里面每一个元素
        // 把A往有序序列中插入,在插入时,是利用二分查找确定A元素的插入点
        // 拿着A元素,跟插入点的元素进行比较,比较的规则就是compare方法的方法体
        // 如果方法的返回值是负数,拿着A元素继续向前比较
        // 如果方法的返回值是正数,拿着A额后面元素比较
        // 如果方法返回值是0,拿着A额后面元素比较
        Arrays.sort(arr, new Comparator<Integer>() {
            // compare方法参数
            // o1表示在无序序列中的,遍历得到的每一个元素
            // o2表示在有序序列中的,遍历得到的每一个元素

            // 返回值:负数:表示当前要插入的元素是小的,放在前面
            // 返回值:正数:表示当前要插入的元素是大的,放在后面
            // 返回值:0:表示当前要插入的元素是一样的,放在后面
            @Override
            public int compare(Integer o1, Integer o2) {
                // System.out.println("--------------------");
                // System.out.println("o1=" + o1);
                // System.out.println("o2=" + o2);

                return o2 - o1;
            }
        });
        // lambda写法
        Arrays.sort(arr, (Integer o1, Integer o2) -> {
            return o2 - o1;
        });
        Arrays.sort(arr, (o1, o2) -> o2 - o1);

        System.out.println(Arrays.toString(arr));
        // 上面一段的简单理解:
        // o1-o2升序 // o2-o1降序
    }
}