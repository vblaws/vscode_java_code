package 泛型.泛型方法;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ListUtil.addAll(list, "adwa", "adw", "1");
        System.out.println(list);

    }
}
