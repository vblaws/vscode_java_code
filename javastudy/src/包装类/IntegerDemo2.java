package 包装类;

public class IntegerDemo2 {
    public static void main(String[] args) {
        // JDK5以后有一个新的机制:自动装箱和自动拆箱
        // 自动装箱:将基本数据类型变成对应包装类
        // 自动拆箱:将包装类变成对应的基本数据类型

        // 这是自动装箱,在底层还是会调用valueOf获取Integer对象,只不过现在变成自动的了
        Integer i1 = 10;
        System.out.println(i1);
        // 这是自动拆箱
        int i = i1 + 1;
        System.out.println(i);
    }
}
