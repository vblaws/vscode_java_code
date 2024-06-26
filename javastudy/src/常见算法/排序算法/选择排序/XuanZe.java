package 常见算法.排序算法.选择排序;

public class XuanZe {
    public static void main(String[] args) {

        /*
         * 选择排序：
         * 1，从0索引开始，跟后面的元素一一比较。
         * 2，小的放前面，大的放后面。
         * 3，第一次循环结束后，最小的数据已经确定。
         * 4，第二次循环从1索引开始以此类推。
         * 
         */
        int[] arr = { 3, 4, 1, 2, 5 };
        long start = System.currentTimeMillis();
        xuanZe(arr);
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }
    }

    public static void xuanZe(int[] arr) {
        // 2.利用选择排序让数组变成 1 2 3 4 5
        /*
         * //第一轮：
         * //从0索引开始，跟后面的元素一一比较。
         * for (int i = 0 + 1; i < arr.length; i++) {
         * //拿着0索引跟后面的数据进行比较
         * if(arr[0] > arr[i]){
         * int temp = arr[0];
         * arr[0] = arr[i];
         * arr[i] = temp;
         * }
         * }
         */

        // 最终代码：
        // 外 循环：几轮
        // i:表示这一轮中，我拿着哪个索引上的数据跟后面的数据 进行比较并交换
        for (int j = 0; j < arr.length - 1; j++) {
            // 内循环：每一轮我要干什么事情？
            // 拿着i跟i后面的数据进行比较交换
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

    }
}
