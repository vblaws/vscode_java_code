package 常见算法.查找算法.分块查找;

public class BlockSearch {
    public static void main(String[] args) {
        /*
         * 分块查找
         * 核心思想:
         * 块内无序 块间有序
         * 实现步骤:
         * 1.创建blockArr存储每一个块对象的信息
         * 2.先查找blockArr确定查找的范围属于哪一块
         * 3.再单独遍历这一块数据即可
         */
        int[] arr = { 16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66 };

        // 创建三个块对象
        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);
        // 创建数组管理三个Block(索引表)
        Block[] blockArr = { b1, b2, b3 };
        // 调用方法:传递索引表,数据,要查找元素
        int num = 16;
        int index = getIndex(blockArr, arr, num);
        System.out.println(index);
    }

    // 利用分块查找的原理,查找num的索引
    private static int getIndex(Block[] blockArr, int[] arr, int num) {
        int index = fendIndexBlock(blockArr, num);
        if (index == -1) {
            return -1;
        }
        int startIndex = blockArr[index].getStartIndex();
        int endIndex = blockArr[index].getEndIndex();
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    // 定义一个方法,用来确定num在那一块
    private static int fendIndexBlock(Block[] blockArr, int num) {
        // Block b1 = new Block(21, 0, 5); -- 0
        // Block b2 = new Block(45, 6, 11);-- 1
        // Block b3 = new Block(73, 12, 17);-- 2
        // 从0开始遍历Blocck数组,如果num小于其中一块的max,那说明num就是那一块的
        for (int i = 0; i < blockArr.length; i++) {
            if (num <= blockArr[i].getMax()) {
                return i;
            }
        }
        return -1;
    }
}
