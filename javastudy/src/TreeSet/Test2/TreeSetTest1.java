package TreeSet.Test2;

import java.util.TreeSet;

public class TreeSetTest1 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 12, 80, 90, 100);
        Student s2 = new Student("lisi", 28, 20, 90, 99);
        Student s3 = new Student("wangwu", 17, 12, 10, 10);
        Student s4 = new Student("zhaosi", 13, 12, 10, 10);
        Student s5 = new Student("xiaoliu", 12, 82, 70, 60);
        Student s6 = new Student("xiaoliu", 12, 82, 70, 60);
        TreeSet<Student> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        ts.forEach(x -> System.out.println(x));
    }
}
