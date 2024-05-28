package 包装类后的小练习;

import java.time.LocalDate;
import java.util.Calendar;

public class getRunYear {
    public static void main(String[] args) {
        // 方法1
        if (yOnRun7(2001)) {
            System.out.println("平年");
        } else {
            System.out.println("闰年");
        }
        System.out.println("=======================");
        // 方法2
        if (yOnRun8(2001)) {
            System.out.println("平年");
        } else {
            System.out.println("闰年");
        }
        // 方法3:LocalDate有一个方法可以直接判断是否是闰年
        LocalDate ld = LocalDate.of(2000, 3, 1);
        if (ld.isLeapYear()) {
            System.out.println("是闰年");
        } else {
            System.out.println("是平年");
        }
    }

    public static boolean yOnRun7(int year) {
        Calendar calendar = Calendar.getInstance();
        // 设置时间
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONDAY, 2);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        // 将日期剪掉1看是28还是29天,来判断是闰年还是平年
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
        if (day == 28) {
            return true;
        }
        return false;

    }

    public static boolean yOnRun8(int year) {
        // 设置日期
        LocalDate localDate = LocalDate.of(year, 3, 1);
        // 减掉1天
        LocalDate localDate2 = localDate.minusDays(1);
        // 获取当前时间
        int day = localDate2.getDayOfMonth();
        System.out.println(day);
        if (day == 28) {
            return true;
        }
        return false;

    }
}