package JavaP161;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo {
    public static void main(String[] args) {
        // BigInteger
        // 1.获取一个随机大整数
        BigInteger bigint = new BigInteger(100, new Random());
        System.out.println(bigint);

        // 2.获取一个指定的大整数
        BigInteger bigint2 = new BigInteger("4892570235");
        System.out.println(bigint2);

        // 3.获取一个指定进制的整数
        BigInteger bigint3 = new BigInteger("1000", 2);
        System.out.println(bigint3);

        // 4.有一个静态方法获取BigInteger对象，内部有优化的:
        // public static BigInteger valueOf(long val)
        // !注意:对象一旦创建内部的值无法改变
        // 细节:参数是long类型的,比较小
        // 这里可以获取long类型长度看一下
        System.out.println("Long类型最大" + Long.MAX_VALUE);
        // 这个方法对常用数字:-16~16做了优化
        // 提前把这个范围以内的数字创建好BigInteger对象,如果多次获取不会创建新的对象

        BigInteger bigint4 = BigInteger.valueOf(5000);
        System.out.println(bigint4);
        // 只要计算就会产生一个新的BigInteger对象
    }
}
