package 泛型.泛型的通配符.练习;

public class HaShiDog extends Dog {

    public HaShiDog(String name, int age) {
        super(name, age);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("一只叫做" + getName() + "的," + getAge() + "岁的哈士奇,在吃骨头,边吃边拆家");
    }
}
