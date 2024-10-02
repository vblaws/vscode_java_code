package 泛型.泛型类;

import java.util.Arrays;

import practiceCode.bookP143.bookP143;

/*
 * 当我们编写一个类的时候,如果不确定类型,可以使用泛型类
 */
public class MyArrayList<E> {
    Object[] objects = new Object[10];
    int size;

    // 这里的T表示不确定的类型,该类型在类名后面已经定义好了,t表示形参名字
    public boolean add(E e) {
        objects[size] = e;
        size++;
        return true;

    }

    public E get(int index) {
        return (E) objects[index];

    }

    @Override
    public String toString() {
        return "MyArrayList [objects=" + Arrays.toString(objects) + ", size=" + size + "]";
    }

}
