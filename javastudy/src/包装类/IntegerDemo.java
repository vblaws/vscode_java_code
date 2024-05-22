package 包装类;

public class IntegerDemo {
    public static void main(String[] args) {
        // 获取Integer对象方法(看得懂就ixing)
        // 通过构造方法获取Integer的对象
        Integer i1 = new Integer("12");
        System.out.println(i1);

        // 通过静态方法获取Integer对象
        Integer i2 = Integer.valueOf(12);
        System.out.println(i2);

        Integer i3 = Integer.valueOf("010010110101011010101", 2);
        System.out.println(i3);
        // 这两种方法获取对象的区别(掌握)
        Integer i5 = Integer.valueOf(10);
        Integer i6 = Integer.valueOf(10);
        System.out.println(i5 == i6);
    }
}
