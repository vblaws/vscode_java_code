package JDK8newCkass.Zone;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantTest {
    public static void main(String[] args) {
        // Instant时间戳
        // 获取当前时间Instant对象
        Instant instant = Instant.now();
        System.out.println(instant);
        // 根据指定秒钟/毫秒/纳秒/获取Instant对象
        Instant instant2 = Instant.ofEpochSecond(10);
        System.out.println(instant2);
        // 指定时区
        ZonedDateTime instant3 = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(instant3);

        // isXxx判断时间
        Instant instant4 = Instant.ofEpochSecond(0l);
        Instant instant5 = Instant.ofEpochSecond(1000l);
        if (instant4.isBefore(instant5)) {
            System.out.println("[]");
        }
        // minusXxxx(long millisToSubtract) 减少时间的方法
        Instant instant6 = Instant.ofEpochSecond(500l);
        System.out.println(instant6);
        // 因为Instant对象是不可修改的,所以这个方法会产生一个新的Instant对象
        Instant instant7 = instant6.minusSeconds(1000l);
        System.out.println(instant7);
        // plusXxxx(long millisToSubtract) 增加时间的方法
        Instant instant8 = Instant.ofEpochSecond(0l);
        System.out.println(instant8);
        Instant instant9 = instant8.plusSeconds(1l);
        System.out.println(instant9);

    }
}
