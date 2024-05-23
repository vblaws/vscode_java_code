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
        // 在使用valueOf方法是,底层会先创建一个Integer数组,里面包含的是已经创建好的Integer对象,范围是-128-127
        // 所以使用valueOf并提供相同的参数,就不会创建新的Integer对象,而是提供已经创建好的Integer对象
        // 但是如果提供的参数大于127或者小于-128,还是会创建新的Integer对象

        // 这么开发的原因:实际开发中-128-127中的数据用的比较多,
        // 如果用一次创建一个对象,
        // 浪费内存,
        // 所以Java提早把给这个范围内数据都创建好对象,需要用到的时候,返回已经创建好的
        Integer i5 = Integer.valueOf(10);
        Integer i6 = Integer.valueOf(10);
        System.out.println(i5 == i6);
        Integer i8 = Integer.valueOf(128);
        Integer i9 = Integer.valueOf(128);
        System.out.println(i8 == i9);
        System.out.println();

        Integer i7 = new Integer(10);
        System.out.println(i5 == i7);
    }
}
