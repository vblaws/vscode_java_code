package practiceCode;

/**
 * MathOperation
 */
@FunctionalInterface
interface MathOperation {
    void run(int a, int b);

}

public class fbnq {
    public static void main(String[] args) {
        System.out.println(fbnq(20));
        System.out.println(recursion(5));
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(midSearch(arr, 2));
        MathOperation ma = new MathOperation() {
            @Override
            public void run(int a, int b) {
                // TODO Auto-generated method stub
                System.out.println("result=" + (a + b));
            }
        };
        ma.run(12, 12);
        MathOperation ma1 = (a, b) -> System.out.println("result=" + (a + b));
        ma1.run(12, 22);

    }

    public static int fbnq(int num) {
        if (num == 1 || num == 0)
            return num;

        return fbnq(num - 1) + fbnq(num - 2);
    }

    public static int recursion(int num) {
        if (num == 1)
            return 1;

        return num *
                recursion(num - 1);
    }

    public static int midSearch(int[] arr, int num) {
        int max = arr.length - 1;
        int min = 0;

        while (true) {
            int mid = (max + min) / 2;
            if (min > max) {
                return -1;
            }
            if (arr[mid] < num) {
                min = mid + 1;
            } else if (arr[mid] > num) {
                max = mid - 1;
            } else {
                return mid;
            }

        }

    }
}
