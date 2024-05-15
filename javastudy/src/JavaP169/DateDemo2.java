package JavaP169;

import java.util.Date;
import java.util.Random;

public class DateDemo2 {
    public static void main(String[] args) {
        date();
        System.out.println();
        bigOrSmall();

    }

    public static void date() {
        Date date = new Date(0l);

        System.out.println(date);

        long time = date.getTime();
        System.out.println(time);

        time = time + 1000l * 60 * 60 * 24 * 365;

        date.setTime(time);

        System.out.println(date);
    }

    public static void bigOrSmall() {
        Random random = new Random();
        Date d1 = new Date(random.nextLong());
        Date d2 = new Date(random.nextLong());
        System.out.println(d1);
        System.out.println(d2);
        long d1Time = d1.getTime();
        long d2Time = d2.getTime();
        boolean result = d1Time > d2Time ? true : false;
        if (result) {
            System.out.println("d1>d2");
        } else {
            System.out.println("d1<d2");
        }
    }
}
