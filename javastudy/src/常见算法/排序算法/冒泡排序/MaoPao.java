package 常见算法.排序算法.冒泡排序;

public class MaoPao {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 1, 1, 3, 32, 32, 11, 22, 33, 10 };
        System.out.println(arr.length);
        for (int i : maoPao(arr)) {
            System.out.print(i + " ");
        }

    }

    public static int[] maoPao(int[] arr) {
        // 外循环:如果有n个数据,只要执行n-1次就可以了
        for (int i = 0; i < arr.length - 1; i++) {
            // 内循环:每一轮中我如何比较数据并且找到当前的最大值
            // -1:为了防止数组越界
            // -i:为了提高效率,每一轮执行次数应该比上一轮少一次
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
