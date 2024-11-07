package HashSet_LinkedHashSet.HashSet;

import java.util.HashSet;

public class HashSetNoSame {
    public static void main(String[] args) {
        HashSet<Student> list = new HashSet<>();
        list.add(new Student("a", 12));
        list.add(new Student("b", 13));
        list.add(new Student("c", 13));
        list.add(new Student("c", 13));
        list.forEach(x -> System.out.println(x));
        System.out.println();
    }
}
