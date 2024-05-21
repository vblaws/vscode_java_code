package JDK8newCkass.Zone;

import java.time.ZoneId;

public class ZoneIdTest {
    public static void main(String[] args) {
        // Zone时区
        // 获取所有时区名称
        for (String string : ZoneId.getAvailableZoneIds()) {
            System.out.println(string);
        }
        System.out.println("+++++++++++++++++++");
        // 获取系统默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
        System.out.println("+++++++++++++++++++");
        // 获取指定时区
        ZoneId zoneId2 = ZoneId.of("Asia/Taipei");
        System.out.println(zoneId2);
    }
}
