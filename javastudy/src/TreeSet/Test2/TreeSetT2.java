package TreeSet.Test2;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetT2 {
    public static void main(String[] args) {
/*
  要求:使用自然排序或者比较器排序
  存入四个字符串:c,ab,df,qwer
  按长度排序，如果长度相等，则比较首首字母
 */

        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            //o1:当前要添加的元素,o2:已存在的元素
            //返回值规则与之前相同
            //匿名内部类形式
            public int compare(String o1, String o2) {
                //自己写的
//                if (o1.length() - o2.length() > 0) {
//                    return 1;
//                }
//                return o1.compareTo(o2);
                //黑马程序员的
                //长度相等,比较首字母
                int i = o1.length() - o2.length();
                //长度不相等,按长短排序
                return i == 0 ? o1.compareTo(o2) : i;

            }
        });
        //Lambda方式
        TreeSet<String> ts1 = new TreeSet<>(((o1, o2) -> o1.length() - o2.length() == 0 ? o1.compareTo(o2) : o1.length() - o2.length()));
        //添加元素
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");
        ts1.add("c");
        ts1.add("ab");
        ts1.add("df");
        ts1.add("qwer");

        System.out.println(ts);
        System.out.println(ts1);
    }
}
