package 常见算法.五道算法题.T3;

public class Test3 {
    public static void main(String[] args) {
        // 有一堆桃子,猴子每天吃掉一半,在多吃一个,以后每天都吃一半,再多吃一个,第十天(还没吃)
        // 发现只剩一个桃子了,请问总控有多少桃子
        // day10:1
        // day9:(day10+1)*2
        // day8:(day9+1)*2
        // ...
        // day1:(day2+1)*2
        System.out.println(fibonacciSequence(1));

    }

    public static int fibonacciSequence(int day) {
        // 反向递归
        if (day <= 0 || day >= 11) {
            System.out.println("当前时间错误");
            return -1;
        }
        if (day == 10) {
            return 1;
        }
        return (fibonacciSequence(day + 1) + 1) * 2;
    }
}
