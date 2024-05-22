package JDK8newCkass.SimpleDateFormat;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        /*
         * | 方法名 | 说明 |
         * | ---------------------------------------- | ------------------ |
         * | static DateTimeFormatter ofPattern(格式) | 获取格式化对象 |
         * | String format(时间对象) | 按照指定方式格式化 |
         */
        Instant i1 = Instant.ofEpochSecond(0l);
        ZonedDateTime z1 = ZonedDateTime.ofInstant(i1, ZoneId.systemDefault());
        System.out.println(z1);
        // 创建格式化/解析器
        DateTimeFormatter d1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // 格式格式化
        System.out.println(d1.format(z1));
    }
}
