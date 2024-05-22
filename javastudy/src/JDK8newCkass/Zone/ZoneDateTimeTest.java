package JDK8newCkass.Zone;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeTest {
    public static void main(String[] args) {
        /*
         * | 方法名 | 说明 |
         * | ------------------------------- | ------------------------------ |
         * | static ZoneDateTime now() | 获取当前时间的ZoneDateTime对象 |
         * | static ZoneDateTime ofXxxx(...) | 获取指定时间的ZoneDateTime对象 |
         * | ZoneDateTime withXxx(时间) | 修改时间系列的方法 |
         * | ZoneDateTime minusXxxx(时间) | 减少时间系列的方法 |
         * | ZoneDateTime plusXxx(时间) | 增加时间系列的方法 |
         */
        // 获取当前时间的ZoneDateTime对象
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        // 获取指定的时间对象(带时区)参数(年,月,日,时,分,秒,纳秒,时区)
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(2000, 2, 3, 23, 12, 22, 10000, ZoneId.systemDefault());
        System.out.println(zonedDateTime2);
        // 通过Instant+时区方式获取时间对象
        Instant instantTest = Instant.ofEpochSecond(0l);
        ZonedDateTime zonedDateTime3 = ZonedDateTime.ofInstant(instantTest, ZoneId.systemDefault());
        System.out.println(zonedDateTime3);
        // 3. withXxx修改时间
        ZonedDateTime zonedDateTime4 = zonedDateTime3.withYear(2000);
        System.out.println(zonedDateTime4);
        // 4. 减少时间
        ZonedDateTime zonedDateTime5 = zonedDateTime4.minusYears(1000l);
        System.out.println(zonedDateTime5);
        // 4.增加时间
        ZonedDateTime zonedDateTime6 = zonedDateTime5.plusYears(20l);
        System.out.println(zonedDateTime6);
        // 细节:JDK8以后的时间对象都是不可以变得,所以如果我们修改了减少了增加了时间
        // 调用者不会发生改变,而是产生一个新的对象

    }
}
