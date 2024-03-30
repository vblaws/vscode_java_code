package JavaP160;

import java.util.Objects;

public class JavaP1601 {
    public static void main(String[] args) {
        // Objects工具类学习
        Student s1 = new Student("zhangsan", 12);
        Student soneHalf = null;
        Student s2 = new Student("zhangsan", 12);
        // System.out.println(s1.equals(s2));
        System.out.println(Objects.equals(s1, s2));
        System.out.println(Objects.equals(soneHalf, s2));
        // Objects.equals方法细节
        // 方法底层会判断s1是否为null,如果为Null，直接返回false
        // 如果s1不为null,那么就利用s1再次调用equals方法
        // 如果s1是Student类型,所以最终还是会调用Student中的equals方法
        // 如果没有重写,比较地址值，如果重写了,比较属性值

        // public static boolean isNull(Object a)
        Student s4 = new Student();
        System.out.println(Objects.isNull(s4));
    }
}
