package 常见算法.排序算法.快速排序.递归算法;

import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        /*
         * 快速排序:
         * 第一轮:把0索引的数字作为基准数,确定基准数在数组中的正确的位置
         * 比基准数小的放左边,比基准数大的放右边
         */
        // YI
        int[] arr2 = new int[1000000];
        Random r = new Random();
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = r.nextInt();
        }
        long start = System.currentTimeMillis();
        quickSort(arr2, 0, arr2.length - 1);
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
        // ER
        int[] arr = { 6, 1, 2, 7, 9, 3, 4, 5, 10, 8 };
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    /*
     * 参数一:需要排序的数组
     * 参数二:要排序数组的开始索引
     * 参数三:要排序数组的结束索引
     */
    public static void quickSort(int[] arr, int startIndex, int endIndex) {
        // 用两个变量记录要查找的范围
        int start = startIndex;
        int end = endIndex;
        // 递归出口
        if (start > end) {
            return;
        }
        // 记录基准数
        int baseNumber = arr[startIndex];
        // 利用循环找到要交换的数字
        while (start != end) {
            // 利用end从后往前,找比基准数小的数er字
            while (true) {
                if (end <= start || arr[end] < baseNumber) {
                    break;
                }
                end--;
            }
            // 利用start从前往后,找比基准数大的数字
            while (true) {
                if (end <= start || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }
            // 把end和start指向的元素交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        // 当end和start指向同一个元素,那么上面的循环就会结束
        // 表示已经找到了基准数在数组中的位置
        // 基准数归位
        int temp = arr[startIndex];
        arr[startIndex] = arr[start];
        arr[start] = temp;

        // 确定6左边的范围,重复刚刚的动作
        quickSort(arr, startIndex, start - 1);
        // 确定6右边的范围,重复刚刚的动作
        quickSort(arr, start + 1, endIndex);
    }
}
