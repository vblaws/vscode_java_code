package 常见算法.常见算法的API.lambda表达式;

import java.util.*;

public class LambdaDemo {
    public static void main(String[] args) {

        Integer[] arr = { 1, 2, 3, 1, 22, 2, 22, 1, 111, 112 };
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        // lambda表达式
        Arrays.sort(arr, (Integer o1, Integer o2) -> {
            return o2 - o1;
        });
        Arrays.sort(arr, (o1, o2) -> o2 - o1);

        System.out.println(Arrays.toString(arr));
        // 上面一段的简单理解:
        // o1-o2升序 // o2-o1降序
    }
}
