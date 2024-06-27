package MyCollection;

import java.util.ArrayList;
import java.util.Collection;

public class MyCollectionDemo2 {
    public static void main(String[] args) {
        Collection<Student> list = new ArrayList<>();
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("Sili", 24);
        Student s3 = new Student("aa", 12);

        Student s4 = new Student("zhangsan", 23);
        list.add(s1);
        list.add(s4);
        list.add(s3);
        list.add(s2);
        System.out.println(list.contains(s4));
    }
}
