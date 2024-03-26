package JavaP160;

public class JavaP160 {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 对象的浅克隆，深克隆和对象工具类Objects
        int[] data = { 1, 2, 3, 4, 5, 67 };
        // 1.先创建一个对象
        User u1 = new User(12, "wx", "123456", "美国大区", data);
        System.out.println(u1);
        // 2.进行对象的克隆
        User u2 = (User) u1.clone();
        System.out.println(u2);
    }
}
