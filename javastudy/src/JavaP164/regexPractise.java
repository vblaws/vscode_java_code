package JavaP164;

import java.util.regex.Pattern;

public class regexPractise {
    public static void main(String[] args) {
        // 正则表达式匹配电话号码
        String str1 = "13706213154";
        String regex1 = "1[3-9][0-9]{9}";
        // 第一:1开头
        // 第二:第二的字符是3-9
        // 第三:数字出现9次
        boolean flag1 = str1.matches(regex1);
        System.out.println(flag1);
        System.out.println("--------------------------------------------------");

        // 正则表达式匹配座机电话号码
        // 座机分为三个部分
        // 1:区号=0[0-9]{2,3}
        // 2.横杠=-?横杠出现一次或者0次
        // 3.号码
        String str2 = "020-2324242";
        String regex2 = "0[0-9]{2,3}-?[1-9]\\d{4,9}";
        boolean flag2 = str2.matches(regex2);
        System.out.println(flag2);
        System.out.println("--------------------------------------------------");
        // 正则表达式匹配邮箱
        // 1:@的左边:\\w+
        // 2:@
        // 3:@
        // 3 .左边,.右边
        String str3 = "3239498031@qq.com.cn";
        String regex3 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-z]{2,3}){1,2}";
        boolean flag3 = str3.matches(regex3);
        System.out.println(flag3);
        System.out.println("--------------------------------------------------");
        String regex4 = "([01]\\d|2[0-3])(:[0-5]\\d){2}";
        String str4 = "12:12:12";
        System.out.println(str4.matches(regex4));
    }
}
