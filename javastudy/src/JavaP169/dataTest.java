package JavaP169;

import java.util.Date;

public class dataTest {
    public static void main(String[] args) {
        // 创建对象表示一个时间
        Date date = new Date();
        System.out.println(date);
        // 创建一个对象获取一个指定的时间
        Date date2 = new Date(0l);
        System.out.println(date2);
        // setTime设置时间
        date2.setTime(1000l);
        System.out.println(date2);
        // getTime获取当前时间毫秒值
        System.out.println(date2.getTime());
    }
}
