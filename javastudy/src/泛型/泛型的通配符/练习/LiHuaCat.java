package 泛型.泛型的通配符.练习;

public class LiHuaCat extends Cat {
    public LiHuaCat() {
        super();
    }

    public LiHuaCat(String name, int age) {
        super(name, age);

    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("一只叫做" + getName() + "的," + getAge() + "岁的狸花猫,在吃鱼");
    }
}