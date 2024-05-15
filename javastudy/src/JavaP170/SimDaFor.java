package JavaP170;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimDaFor {
    public static void main(String[] args) {
        // 空参构造默认格式
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        Date date = new Date(0l);
        String str1 = sdf1.format(date);
        System.out.println(str1);

        // 利用带参数构造创建SimpleDateFormat对象,指定格式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        Date date2 = new Date(0l);
        String str2 = sdf2.format(date2);
        System.out.println(str2);

        // test
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日 a HH:mm:ss E");
        Date d3 = new Date();
        String str3 = sdf3.format(d3);
        System.out.println(str3);

    }
}
