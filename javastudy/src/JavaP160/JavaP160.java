package JavaP160;

import com.google.gson.Gson;

public class JavaP160 {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 对象的浅克隆，深克隆和对象工具类Objects
        int[] data = { 1, 2, 3, 4, 5, 67 };
        // 1.先创建一个对象
        User u1 = new User(12, "wx", "123456", "美国大区", data);
        System.out.println(u1);
        // 2.进行对象的克隆
        // 书写细节:重写Object中的clone方法
        // 让JavaBean类实现Cloneable接口
        // 创建原对象并调用clone就可以了

        User u2 = (User) u1.clone();
        System.out.println(u2);
        // Object中的clone默认是浅克隆
        // 这里是已经重写过的
        int[] add = u1.getData();
        add[0] = 100;
        System.out.println(u1);
        System.out.println(u2);
        // Gson是一个外部库,需要导入
        // 创建一个对象
        Gson gson = new Gson();
        // 将对象变成Json字符串
        String s = gson.toJson(u1);
        // 打印Json字符串
        System.out.println(s);
        // 将字符串变回对象,有两个参数，前面是Json字符串，后面是对象的类型
        User user = gson.fromJson(s, User.class);
        // 打印user对象
        System.out.println(user);
        // 可以代替深克隆使用
        User user2 = gson.fromJson(s, User.class);
        System.out.println(user2);
    }
}
