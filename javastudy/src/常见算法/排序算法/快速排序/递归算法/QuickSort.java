package 常见算法.排序算法.快速排序.递归算法;

public class QuickSort {
    public static void main(String[] args) {
        /*
         * 快速排序:
         * 第一轮:把0索引的数字作为基准数,确定基准数在数组中的正确的位置
         * 比基准数小的放左边,比基准数大的放右边
         */
        int[] arr = { 6, 1, 2, 7, 9, 3, 4, 5, 10, 8 };

        for (int i : quickSort(arr, 0, arr.length - 1)) {
            System.out.println(i);
        }
    }

    /*
     * 参数一:需要排序的数组
     * 参数二:要排序数组的开始索引
     * 参数三:要排序数组的结束索引
     */
    public static int[] quickSort(int[] arr, int startIndex, int endIndex) {
        // 用两个变量记录要查找的范围
        int start = startIndex;
        int end = endIndex;
        // 记录基准数
        int baseNumber = arr[startIndex];
        // 利用循环找到要交换的数字
        while (start != end) {

        }
        return arr;
    }
}
