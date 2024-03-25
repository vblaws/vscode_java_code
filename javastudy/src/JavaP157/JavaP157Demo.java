package JavaP157;

public class JavaP157Demo {
    public static void main(String[] args) {
        // 时间戳的应用
        // System.currentTimeMillis方法使用
        long start = System.currentTimeMillis();
        for (int i = 1; i < 1000; i++) {
            boolean result = isPrime1(i);
            if (result) {
                System.out.println(i);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("程序执行时间" + (end - start));

        long start1 = System.currentTimeMillis();
        for (int i = 1; i < 100; i++) {
            boolean result = isPrime2(i);
            if (result) {
                System.out.println(i);
            }
        }
        long end1 = System.currentTimeMillis();
        System.out.println("程序执行时间" + (end1 - start1));

    }

    public static boolean isPrime1(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime2(int num) {
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
