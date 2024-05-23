package 包装类;

public class IntegerDemo3 {
    public static void main(String[] args) {
        // Integer成员方法
        /*
         * | 方法名 | 说明 |
         * | ------------------------------------------ |
         * ------------------------------------- |
         * | public static String toBinaryString(int i) | 得到二进制 |
         * | public static String toOctalString(int i) | 得到八进制 |
         * | public static String toHexString(int i ) | 得到十六进制 |
         * | public static int parselnt(Stirng s) | 将字符串类型的整数转换为int类型的整数 |
         */
        String str1 = Integer.toBinaryString(12);
        System.out.println(str1);

        String str2 = Integer.toOctalString(12);
        System.out.println(str2);

        String str3 = Integer.toHexString(12);
        System.out.println(str3);

        System.out.println("结果:" + Integer.parseInt(str3));
        // 细节1:在类型转换的时候,括号中的数字不能是其他，否则会报错
        // 细节2:除了Character都有对象的parseXxx方法,进行类型转换
        String str = "true";
        boolean b = Boolean.parseBoolean(str);
        System.out.println(b);
    }

}
