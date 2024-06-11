package 常见算法.查找算法.基本查找;

public class BasicSearchTest1 {
    public static void main(String[] args) {
        // 题目:使用查找算法查找元素并且返回元素的索引
        // 不需要考虑是否重复
        int[] arr = { 1, 2, 33, 22, 11, 33 };
        System.out.println(selectNum(arr, 33));
    }

    public static int selectNum(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
