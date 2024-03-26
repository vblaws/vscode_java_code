package JavaP159;

public class JavaP159Demo1 {
    public static void main(String[] args) {
        // Object中equals方法
        Student s1 = new Student("ws", 12);
        Student s2 = new Student("ws", 12);
        boolean reslult = s1.equals(s2);// 现在重写了equals方法，比较的是内部的属性值
        System.out.println(reslult);
    }
}
