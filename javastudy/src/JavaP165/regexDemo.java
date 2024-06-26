package JavaP165;

import java.util.Random;

public class regexDemo {
    public static void main(String[] args) {
        // 正则表达式验证用户名
        String regex1 = "\\w{4,16}";
        System.out.println("Hexiaolei123".matches(regex1));
        System.out.println("---------------------------------");
        // 正则表达式验证身份证号码
        String regex2 = "[1-9]\\d{16}(\\d|X|x)";
        System.out.println("320505200701261511".matches(regex2));

        if (regex1.equals(regex2)) {
            System.out.println("Two same String");
        } else {
            System.out.println("They are");
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            Random r = new Random();
            r.nextInt();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
    }
}
