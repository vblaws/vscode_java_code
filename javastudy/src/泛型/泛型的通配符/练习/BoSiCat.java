package 泛型.泛型的通配符.练习;

public class BoSiCat extends Cat {
    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "的," + getAge() + "的波斯猫,在吃小饼干");
    }
}
