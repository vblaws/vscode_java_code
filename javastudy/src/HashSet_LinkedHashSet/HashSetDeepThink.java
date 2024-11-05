package HashSet_LinkedHashSet;

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
        if (a.hashCode() == b.hashCode()) {
            System.out.println("Hash值相同");
        } else {
            System.out.println("Hash值不同");
        }


    }
}
