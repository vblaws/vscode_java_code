package Stream流.midMethod;

import java.util.Arrays;

public class StreamDemo3 {
    public static void main(String[] args) {
//        | 数组         | `public static <T> Stream<T> stream(T[] array)` | Arrays工具类中的静态方法 |
        int[] arr = new int[]{1,2,3,4,5,6,6,7,8,8,9,9,23,2,3,4,34,34,34,34,};
        Arrays.stream(arr).forEach(x-> System.out.println(x));
    }
}
