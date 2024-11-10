package TreeSet.Test1;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //TreeSet不用重写equals和hashcode,底层不是equals和hashcode

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Student student)) return false;
//        return age == student.age && Objects.equals(name, student.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}' + '\n';
    }

    @Override
    public int compareTo(Student o) {
//        this:要添加的元素,o:已添加的元素
//        负数:认为当前要添加的元素是小的,存左边
//        正数:认为当前要添加的元素是大的,存右边
//        0:认为当前要添加元素已存在,丢弃
        System.out.println("------------------------");
        System.out.print("this=" + this);
        System.out.print("o=" + o);
//        指定排序排序规则
        return o.getAge() - this.getAge();

    }
}
