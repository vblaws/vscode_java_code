package 常见算法.排序算法.插入排序;

public class ChaRu {
    public static void main(String[] args) {
        /*
         * 将0索引的元素到N索引的元素看做是有序的，把N+1索引的元素到最后一个当成是无序的。
         * 
         * 遍历无序的数据，将遍历到的元素插入有序序列中适当的位置，如遇到相同数据，插在后面。
         * 
         * N的范围：0~最大索引
         */
        int[] arr = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 50 };
        for (int i : chaRu(arr)) {
            System.out.print(i + " ");
        }
    }

    public static int[] chaRu(int[] arr) {
        // 1.找到无序的一组数据的索引从哪里开始的
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                startIndex = i + 1;
                break;
            }
        }
        // 2.遍历从startIndex开始的所有元素,一次得到无序的那一组的每一个元素
        for (int i = startIndex; i < arr.length; i++) {
            // 问题:如何把遍历到的数据,插入到前面有序的一组当中
            // System.out.print(arr[i] + " ");
            // 记录当前要插入数据的索引
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                // 交换位置
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        return arr;

    }
}
