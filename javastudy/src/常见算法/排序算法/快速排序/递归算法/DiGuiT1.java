package 常见算法.排序算法.快速排序.递归算法;

public class DiGuiT1 {
    public static void main(String[] args) {
        System.out.println(getFactorialRecursion(5));
    }

    // 这个方法含义为
    // get得到,factorial阶乘,recursion是递归
    public static int getFactorialRecursion(int number) {
        /*
         * 5!=5*4!
         * 4!=4*3!
         * 3!=3*2!
         * 2!=2*1!
         * 1!=1
         */
        if (number == 1) {
            return 1;
        }
        return number * getFactorialRecursion(number - 1);
    }
}
