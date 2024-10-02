package 泛型.泛型的通配符;

import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        /*
         * 泛型不具备继承性,但是数据具有继承性
         */
        ArrayList<Grandpa> list = new ArrayList<>();

        ArrayList<Father> list1 = new ArrayList<>();

        ArrayList<Son> list2 = new ArrayList<>();
        method(list);
        method(list1);
        method(list2);

    }

    /*
     * 泛型的通配符:
     * ?也表示不确定的类型
     * 它可以进行类型的限定
     * ? extends E:表示可以传递E或者E的子类类型
     * ? super E:表示可以E或者E的父类类型
     * 泛型的通配符
     * 关键点:可以限定类型的范围
     */
    // public static void method(ArrayList<Grandpa> list),如果这样子写只能传入类型为Grandpa类的数据
    public static void method(ArrayList<? super Son> list) {

    }
}

class Grandpa {

}

class Father extends Grandpa {

}

class Son extends Father {

}
