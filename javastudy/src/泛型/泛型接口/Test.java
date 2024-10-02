package 泛型.泛型接口;

public class Test {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.add("ad");
        list.add("ad");
        list.add("ad");
        list.add("ad");
        list.add("ad");
        list.add("ad");
        System.out.println("+++++++++++++++++++++++++");
        MyList2<Integer> list2 = new MyList2<>();
        list2.add(1);
        list2.add(2);
        System.out.println();
    }
}
