package Javap163;

public class regexDemo2 {
    public static void main(String[] args) {
        // \ 转义字符，会改变后面那个字符原来的意思
        // 比如 " 意思是一个字符串开头或者结尾
        // \" 就是代表打印出一个 " 号来
        String str = "3_a";
        System.out.println(str.matches("\\d\\w\\w"));

        // 正则表达式数量词
        // 匹配数字字符和下划线,至少6次
        String str2 = "890234whd";
        System.out.println(str2.matches("\\w{6,}"));
        // 只能出现数字和字符,正好4位
        String str3 = "324h";
        System.out.println(str3.matches("[\\w&&[^_]]{4}"));
    }
}
