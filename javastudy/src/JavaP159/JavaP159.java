package JavaP159;

public class JavaP159 {
    public static void main(String[] args) {
        // 1.toString,将对象以字符串格式返回
        Object object = new Object();
        String str = object.toString();
        System.out.println(str);// java.lang.Object@5f5a92bb
        // 有一个细节:这里并没有写toString,但是直接输出还是跟上面的相同
        // System:类名
        // out:静态常量名,这里的final修饰的是引用数据类型,地址值不能变,内容可以变
        // println():方法名
        // 参数:标识要输出的内容
        // 核心逻辑,当我们打印一个对象的时候,底层会调用对象的toString方法,把对象变成字符串,然后再打印再控制台上,打印完毕换行处理

        System.out.println(object);

        // 默认情况下Object类中的toString方法返回的是地址值
        // 但是打印地址值又没什么意义
        // 所以我们可以重写父类中的toString方法
        Student student = new Student("wx", 12);
        System.out.println(student.toString());
    }
}
