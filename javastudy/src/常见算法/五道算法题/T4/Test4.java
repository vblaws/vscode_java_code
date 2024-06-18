package 常见算法.五道算法题.T4;

public class Test4 {
    public static void main(String[] args) {
        /*
         * 爬楼梯:小明有时候一次爬一个台阶,有的时候爬两个台阶,
         * 如果楼梯有二十个台阶,
         * 小明一共有多少种爬法
         */
        System.out.println(getSum(20));
    }

    public static int getSum(int num) {
        if (num == 1) {
            return 1;
        }
        if (num == 2) {
            return 2;
        }
        if (num == 3) {
            return 3;
        }
        return getSum(num - 1) + getSum(num - 2) + getSum(num - 3);
    }
}
