package 泛型.泛型的通配符.练习;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        TaiDiDog a = new TaiDiDog("12", 12);

    }

    public static void KeepPet(ArrayList<? extends Animal> list) {

    }
}
