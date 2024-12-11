package Stream流.midMethod;

import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
//               | 一堆零散数据 | `public static<T> Stream<T> of(T... values)`    | Stream接口中的静态方法   |
        //Stream接口中静态方法of细节 ：
        //方法的参数是可变参数，也可以传递数组
        //但必须是引用数据类型的否则就会出现以下情况,因为如果传递基本数据类型的话，会把这个数组当成一个元素，放到Stream流中
        //[I@f6f4d33
        int[] arr = new int[]{123,123,123};
        Stream.of(arr).forEach(x-> System.out.println(x));
        Stream.of(1,2,3,4,5,6).forEach(x-> System.out.println(x));
    }
}
