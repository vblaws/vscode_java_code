package 常见算法.常见算法的API;

import java.util.Arrays;

public class MyArrayDemo {
    /*
     * | public static String toString(数组) | 把数组拼接成一个字符串 |
     * | public static int binarySearch(数组，查找的元素) | 二分查找法查找元素 |
     * | public static int[] copyOf(原数组,新数组长度) | 拷贝数组 |
     * | public static int[] copyOfRange(原数组,起始索引,结束索引) | 拷贝数组（指定范围） |
     * | public static void fill(数组,元素) | 填充数组 |
     * | public static void sort(数组) | 按照默认方式进行数组排序 |
     * | public static void sort(数组，排序规则) | 按照指定的规则排序 |
     */
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // 将数组变成字符串
        System.out.println("--------toString---------");
        System.out.println(Arrays.toString(arr));
        // 二分查找
        System.out.println("--------binarySearch---------");
        // 二分查找的前提:数据必须是有序而且是升序,
        // 细节1:如果元素存在,返回的是真实的索引
        // 细节2:如果元素不存在,返回的是-插入点-1
        System.out.println(Arrays.binarySearch(arr, 10));
        System.out.println(Arrays.binarySearch(arr, 5));
        // 拷贝数组
        System.out.println("--------copyOf--------");
        // 第一个参数是原数组
        // 第二个参数是创建新数组的长度
        // 如果短于原来的数组,部分拷贝
        // 如果等于原来的数组,完全拷贝
        // 如果长于原来的数组,会将多余的补上默认值
        int[] newArr = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(newArr));
        // 拷贝指定长度数组
        System.out.println("--------copyOfRange--------");
        // 包头不包尾
        int[] newArr1 = Arrays.copyOfRange(arr, 0, 9);
        System.out.println(Arrays.toString(newArr1));
        // fill填充元素
        System.out.println("--------fill--------");
        Arrays.fill(newArr1, 20);
        System.out.println(Arrays.toString(newArr1));
        // sort排序:默认情况下,给基本数据类型作升序,底层使用的是快速排序
        System.out.println("--------sort--------");
        int[] arrX = { 1, 2, 3, 3, 1, 1, 11, 1, 1, 1, 2, 323, 23, 1, 12, 4, 24, 24, 23, 23 };
        Arrays.sort(arrX);
        System.out.println(Arrays.toString(arrX));

    }
}
