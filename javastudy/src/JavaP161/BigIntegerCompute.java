package JavaP161;

import java.math.BigInteger;

public class BigIntegerCompute {
    public static void main(String[] args) {
        // |方法名|说明|
        // |:-:|:-:|
        // |public BigIntegeradd(BigInteger val)|加法|
        // |public BigInteger subtract(BigInteger val)|减法|
        // |public BigInteger multiply(BigInteger val)|乘法|
        // |public BigInteger divide(BigInteger val)|除法,获取商|
        // |public BigInteger[] divideAndRemainder(BigInteger val)|除法,获取商和余数|
        // |public boolean equals(Object x)|比较是否相同|
        // |public BigInteger pow(int exponent)|次幂|
        // |public BigInteger max/min(BigInteger val)|返回较大/较小值|
        // |public int intValue(BigInteger val)|转为int类型整数,超出范围数据有误|

        // 创建两个BigInteger对象
        BigInteger bi1 = BigInteger.valueOf(14);
        BigInteger bi2 = BigInteger.valueOf(5);

        // 1.加法
        BigInteger bi3 = bi1.add(bi2);
        System.out.println(bi3);

        // 2.减法
        BigInteger bi4 = bi1.subtract(bi2);
        System.out.println(bi4);

        // 3.取商和余数
        BigInteger bi5[] = bi1.divideAndRemainder(bi2);
        System.out.println("商" + bi5[0] + "," + "余数" + bi5[1]);

        // 4.比较是否相同
        boolean bi6 = bi1.equals(bi2);
        System.out.println(bi6);

        // 5.次幂
        System.out.println(bi1.pow(10));// pow参数是int类型的

        // 6.转换为int数据类型
        BigInteger bi7 = BigInteger.valueOf(1000);
        int bi71 = bi7.intValue();
        // 如果想要转换数字类型的话
        // 转化为long,longValue
        // 转化为double,doubleValue
        System.out.println(bi71);
        BigInteger test = new BigInteger("823945732942704745235325");
        System.out.println(test);
    }
}
