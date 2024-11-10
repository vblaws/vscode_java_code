package TreeSet.Test1;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();
        ts.add(new Student("a", 12));
        ts.add(new Student("b", 13));
        ts.add(new Student("c", 14));
        System.out.println("----------------------");
        System.out.println(ts);

    }
}
