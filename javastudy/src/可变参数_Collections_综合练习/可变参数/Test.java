package 可变参数_Collections_综合练习.可变参数;

public class Test {
    public static void main(String[] args) {
        System.out.println(getSum(12, 12, 12, 12, 12, 12, 12, 12, 12));

    }
    public static int getSum(int...e){
        int sum=0;

        for (int i : e) {
            sum+=i;
        }
        return sum;
    }
}
