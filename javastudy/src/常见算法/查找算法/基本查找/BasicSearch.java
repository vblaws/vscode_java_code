package 常见算法.查找算法.基本查找;

public class BasicSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 33, 22, 11, 33 };
        if (selectNum(arr, 12)) {
            System.out.println("数字存在");
        } else {
            System.out.println("数字不存在");
        }

    }

    public static boolean selectNum(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
