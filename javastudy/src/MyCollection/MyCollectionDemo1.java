package MyCollection;

import java.util.ArrayList;
import java.util.Collection;

public class MyCollectionDemo1 {
    public static void main(String[] args) {
        /*
         * | 方法名称 | 说明 |
         * | ----------------------------------- | -------------------------------- |
         * | public boolean add(E e) | 把给定的对象添加到当前集合中 |
         * | public void clear() | 清空集合中所有的元素 |
         * | public boolean remove(E e) | 把给定的对象在当前集合中删除 |
         * | public boolean contains(Object obj) | 判断当前集合中是否包含给定的对象 |
         * | public boolean isEmpty() | 判断当前集合是否为空 |
         * | public int size() | 返回集合中元素的个数/集合的长度 |
         */
        // Collection是一个接口,不能直接生成他的对象,所以
        // 如果要学习他的方法,智能创建他实现类的对象
        // 实现类ArrayList
        // 下列是使用多态的形式创建的
        Collection<String> coll = new ArrayList<>();
        // 1.添加元素
        // 细节:返回值(true false),如果往list集合内添加数据,那么方法永远返回true,因为list允许元素重复
        // 细节:如果往Set集合内添加数据,如果数据没有,方法返回true,则添加成功,如果数据已存在,返回false,则添加失败
        // 因为Set集合不允许重复
        coll.add("a");
        coll.add("a");
        coll.add("b");
        coll.add("c");
        coll.add("c");

        System.out.println(coll);
        // coll.clear();
        // 删除元素不存在会返回false,成功则返回true
        // 不能通过索引删除,只能通过元素删除
        coll.remove("a");
        // 底层依赖equals方法来判断是否存在
        System.out.println(coll.contains("c"));
        System.out.println(coll.size());
        System.out.println(coll);
    }
}