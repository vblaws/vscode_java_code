package 常见算法.五道算法题.T2;

public class Test2 {
    public static void main(String[] args) {
        /*
         * 练习题2:有一对兔子,从出生后第三个月起每个月都生一对兔子,小兔子长到三个月后每个月有生一对兔子
         * 假如兔子都不死,第十二个月兔子对数是多少
         * <斐波那契数列>
         */
        // 方法1:创建长度为12的数组,给0和1索引赋值为1,
        // 循环相加
        int[] arr = new int[12];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[11]);
        // 方式2(递归):
        // 考虑出口
        // 找到规律
        System.out.println(fibonacciSequence(12));

    }

    public static int fibonacciSequence(int num) {

        if (num == 1 || num == 2) {
            return 1;
        }
        return fibonacciSequence(num - 1) + fibonacciSequence(num - 2);
    }
}
