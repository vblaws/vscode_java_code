package Javap163;

public class RegexDemo {
    public static void main(String[] args) {

        String qq = "3239498031";
        String qq1 = "123";
        String qq2 = "23847057829353214123553124523453";
        String qq3 = "dyugi389754";

        // checkQQ(qq);
        // System.out.println(checkQQ1(qq));
        System.out.println(checkQQ1(qq));
        System.out.println(checkQQ1(qq1));
        System.out.println(checkQQ1(qq2));
        System.out.println(checkQQ1(qq3));

        // 正则表达式体验
        System.out.println(qq.matches("[1-9]\\d{5,19}"));

    }

    public static boolean checkQQ1(String qq) {
        if (qq.length() <= 6 || qq.length() >= 20) {
            System.out.println("太短或者太长");
            return false;
        } else if (qq.startsWith("0")) {
            System.out.println("不能以0作为开头");
            return false;
        }

        for (int i = 0; i < qq.length(); i++) {
            if (!Character.isDigit(qq.charAt(i))) {
                System.out.println("出现其他字符了");
                return false;
            }
        }
        System.out.println("OK了");
        return true;
    }

}
