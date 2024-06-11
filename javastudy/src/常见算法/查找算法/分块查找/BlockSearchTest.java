package 常见算法.查找算法.分块查找;

public class BlockSearchTest {
    public static void main(String[] args) {
        // 分块查找,无规则
        int[] arr = { 27, 22, 30, 40,
                36, 13, 19, 16, 20,
                7, 10,
                43, 50, 48 };
        BlockTest b1 = new BlockTest(22, 30, 0, 6);
        BlockTest b2 = new BlockTest(13, 36, 4, 8);
        BlockTest b3 = new BlockTest(7, 10, 9, 10);
        BlockTest b4 = new BlockTest(43, 50, 11, 13);
        BlockTest[] blockTestsArr = { b1, b2, b3, b4 };
        int index = getIndex(blockTestsArr, arr, 7);
        System.out.println(index);
    }

    private static int getIndex(BlockTest[] blockTestsArr, int[] arr, int num) {
        int index = fendIndexBlock(blockTestsArr, num);
        if (index == -1) {
            return -1;
        }
        int startIndex = blockTestsArr[index].getStartIndex();
        int endIndex = blockTestsArr[index].getEndIndex();
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    // 定义一个方法,用来确定num在那一块
    private static int fendIndexBlock(BlockTest[] blockArr, int num) {

        for (int i = 0; i < blockArr.length; i++) {
            if (num >= blockArr[i].getMin() && num <= blockArr[i].getMax()) {
                return i;
            }
        }
        return -1;
    }
}
