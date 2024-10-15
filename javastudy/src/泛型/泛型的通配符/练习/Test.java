package 泛型.泛型的通配符.练习;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        HaShiDog haShiDog = new HaShiDog(null, 0);
        ArrayList<HaShiDog> list = new ArrayList<>();
        list.add(haShiDog);
        KeepPet(list);
    }
    // 这是可以所有动物都可以喂养
    // public static void KeepPet(ArrayList<? extends Animal> list) {

    // }
    // 只能喂养狗
    public static void KeepPet(ArrayList<? extends Dog> list) {
        for (Dog dog : list) {
            dog.eat();
        }
    }

    // 只能喂养猫
    // public static void KeepPet(ArrayList<? extends Cat> list) {
    // System.out.println();
    // }
}
