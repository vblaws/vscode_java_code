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
        BigInteger bi1 = BigInteger.valueOf(14);
        BigInteger bi2 = BigInteger.valueOf(5);
        BigInteger bi3 = bi1.add(bi2);
        System.out.println(bi3);
    }
}
