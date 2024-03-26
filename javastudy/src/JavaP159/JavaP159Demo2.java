package JavaP159;

public class JavaP159Demo2 {
    public static void main(String[] args) {
        // 这是对equals的小练习
        String s1 = "abc";
        StringBuilder s2 = new StringBuilder("abc");

        System.out.println(s1.equals(s2));
        // 因为equals是被s1调用的，而s1是字符串,调用的是字符串里面的equals方法
        // 字符串里面的equals方法,先判断参数是否是字符串
        // 但是Stringbuilder是StringBuilder的类对象,所以就不相等
        // 所以就会返回false
        System.out.println(s2.equals(s1));
        // 这里equals是被s2调用的,而s2是StringBuilder类对象
        // 在StringBuilder中,没有重写equals方法
        // 所以调用的是object中的equals方法
        // 在object中,==号比较的是地址值
        // 所以这两个记录地址值不一样,就会返回false
    }
}
