package 泛型.泛型类;

public class Test {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("adw");
        list.add("adwadw");
        System.out.println(list.get(1));
        System.out.println(list);
    }
}
