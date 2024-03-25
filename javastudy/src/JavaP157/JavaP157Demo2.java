package JavaP157;

public class JavaP157Demo2 {
    public static void main(String[] args) {
        // 如何使用System.arraycopy
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr2 = new int[10];
        // 参数一:要拷贝的源数组
        // 参数二:拷贝的索引
        // 参数三:目标数组
        // 参数四:目标数组索引
        // 参数五:需要复制的个数
        System.arraycopy(arr1, 0, arr2, 0, 10);

        for (int arr22 : arr2) {
            System.out.println(arr22);
        }
        // 课堂练习1:
        int[] arr3 = new int[10];
        System.arraycopy(arr1, 0, arr3, 4, 3);
        for (int i : arr3) {
            System.out.print(i + " ");
        }
        System.out.println();
        // 课堂练习2:
        int[] arr4 = new int[10];
        System.arraycopy(arr1, 6, arr4, 2, 3);
        for (int i : arr4) {
            System.out.print(i + " ");
        }
        // 换行
        System.out.println();
        // 如果拷贝的是引用数据类型
        // 子类类型可以赋值给父类类型
        Student s1 = new Student("wx", 12);
        Student s2 = new Student("ww", 22);
        Student s3 = new Student( "wa", 99);

        Student[] stuArr = { s1, s2, s3 };
        Person[] perArr = new Person[3];
        System.arraycopy(stuArr, 0, perArr, 0, 3);
        for (Person person : perArr) {
            Student sty = (Student) person;

            System.out.println(sty.getAge() + "," + sty.getName());
        }
    }
}

class Person {
    // this is a message
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student extends Person {

    public Student(String name, int age) {
        super(name, age);
    }
}
