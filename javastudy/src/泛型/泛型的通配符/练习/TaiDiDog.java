package 泛型.泛型的通配符.练习;

public class TaiDiDog extends Dog {
    public TaiDiDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("一只叫做" + getName() + "的," + getAge() + "岁的泰迪,在吃骨头,边吃边蹭");
    }
}
