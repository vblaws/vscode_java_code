package practiceCode;

public class fbnq {
    public static void main(String[] args) {
        System.out.println(fbnq(20));
        System.out.println(recursion(5));
    }

    public static int fbnq(int num) {
        if (num == 1 || num == 0)
            return num;

        return fbnq(num - 1) + fbnq(num - 2);
    }

    public static int recursion(int num) {
        if (num == 1)
            return 1;

        return num * recursion(num - 1);
    }
}
