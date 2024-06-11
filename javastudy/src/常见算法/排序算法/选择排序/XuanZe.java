package 常见算法.排序算法.选择排序;

public class XuanZe {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 1, 2, 5 };
        for (int i : xuanZe(arr)) {
            System.out.print(i + " ");
        }
    }

    public static int[] xuanZe(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        return arr;
    }
}
