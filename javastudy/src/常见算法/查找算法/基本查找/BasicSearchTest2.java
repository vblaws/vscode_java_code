package 常见算法.查找算法.基本查找;

import java.util.ArrayList;

public class BasicSearchTest2 {
    public static void main(String[] args) {
        // 这是找到重复值的索引的查找算法
        int[] arr = { 1, 2, 3, 3, 4 };
        for (int i : searchNum(arr, 3)) {
            System.out.println(i);
        }
    }

    public static ArrayList<Integer> searchNum(int[] arr, int num) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                list.add(i);
            }
        }
        return list;
    }
}
