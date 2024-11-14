package 可变参数_Collections_综合练习.综合练习;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.function.Consumer;

public class T1 {
    public static final int  MAN=1;
    public static final int  WOMAN=0;

    public static void main(String[] args) {
        //随机点名1.0
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"Marry","Cindy","Mike","Trump","Elon Mask");
        Random r = new Random();
        System.out.println(list.get(r.nextInt(list.size())));
        //随机点名2.0,Man 70% Woman 30%
        ArrayList<Integer> a1 = new ArrayList<>();
        Collections.addAll(a1,1,1,1,1,1,1,1,0,0,0);

        int result = r.nextInt(a1.size());
        Consumer<Integer> random = x-> {
            if (x == MAN) {
                System.out.println("男人");
            }else {
                System.out.println("女人");
            }
        };

        random.accept(result);

        //练习3，有x名学生,被点到的不会再被点到，如果点完就进行第二轮
        Random r1 = new Random();

        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<String> alreadyOrdered = new ArrayList<>();
        Collections.addAll(studentList,"Leana,Elon,Hals","swift","hh");
    }
}
