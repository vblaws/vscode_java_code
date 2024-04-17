package JavaP162;

import java.math.*;

public class BigDecimalDemo {
    public static void main(String[] args) {
        /*
         * public BigDecimal(double val) 通过传入double获取BigDecimal对象!,这种方法会出现不可预知的问题,最好不要用
         * public BigDecimal(String val) 通过传入String获取BigDecimal对象,这种方法会更加精确
         */
        // 静态方法获取BigDecimal对象
        // public static BigDecimal(double val)
        // 方法1
        BigDecimal bd1 = new BigDecimal(0.01);
        System.out.println(bd1);
        // 方法2
        BigDecimal bd2 = new BigDecimal("322305967.124");
        System.out.println(bd2);

        // 常用方法演示

        BigDecimal bd3 = new BigDecimal("21.1");
        BigDecimal bd4 = new BigDecimal("3.1");

        // 加法
        BigDecimal bd5 = bd3.add(bd4);
        System.out.println(bd5);

        // 除法
        BigDecimal bd6 = bd3.divide(bd4, 2, RoundingMode.HALF_UP);// 这个表示是四舍五入
        System.out.println(bd6);

    }
}
