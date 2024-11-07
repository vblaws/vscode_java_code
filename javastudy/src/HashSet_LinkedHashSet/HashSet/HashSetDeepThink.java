package HashSet_LinkedHashSet.HashSet;

import java.util.HashSet;
import java.util.Objects;

public class HashSetDeepThink {
    public static void main(String[] args) {
        /*
        Hash值特点:
        如果没有重写hashcode方法,会计算地址值的hash值
        如果重写了hashcode方法，会比较对象内部属性值的hash值
        有小概率情况hash碰撞
         */
        Student a = new Student("a", 12);
        Student b = new Student("a", 12);
        Student c = new Student("a", 11);
        if (a.hashCode() == b.hashCode()) {
            System.out.println("Hash值相同");
            System.out.println(Objects.hash(1, 2, 2, 3, 3));
        } else {
            System.out.println("Hash值不同");
        }
//        小部分情况下，不同的属性会导致hash值相同,算出来的哈希值也有可能相同(哈希碰撞)
        System.out.println("abc".hashCode());
        System.out.println("acD".hashCode());


        HashSet<Student> list = new HashSet<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.forEach(x -> System.out.println(x));
    }
}
