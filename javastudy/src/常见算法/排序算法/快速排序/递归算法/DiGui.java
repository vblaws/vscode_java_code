package 常见算法.排序算法.快速排序.递归算法;

public class DiGui {
    public static void main(String[] args) {
        // 从1加到100
        System.out.println(getSum(100));
    }

    public static int getSum(int num) {
        // 出口
        if (num == 1) {
            return 1;
        }

        return num + getSum(num - 1);
    }
}
