package JavaP171_Calender;

import java.util.Calendar;
import java.util.Date;

public class CalDemo1 {
    public static void main(String[] args) {
        // 因为Calendar是一个抽象类,只能通过一个静态方法获取。
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        // 2.修改日历代表时间
        Date d = new Date(0l);
        calendar.setTime(d);
        System.out.println(calendar);
        long time = calendar.getTimeInMillis();
        System.out.println(time);
        /*
         * | public int get(int field) | 取日历中某个字段的信息 |
         * | public void set(int field,int value) | 修改日历的某个字段的信息 |
         * | public void add(int field,int amount) | 为某个字段增加/减少指定的值 |
         */
        // 1:纪元
        // 2:年
        // 3.一年中的第几周
        // 4.一个月中的第几周
        // 5.一个月中的第几天
        // ..
        // 16:
        // 不过:Java为了方便,把索引的数字定义为常量,在Calendar类中可以看到
        // set方法
        calendar.set(Calendar.YEAR, 2000);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(year + "," + month + "," + day + "," + getWeek(week));

    }

    public static String getWeek(int week) {
        String[] date = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
        return date[week - 1];
    }
}
