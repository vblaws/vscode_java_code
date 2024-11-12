package SchoolTest;

import java.lang.reflect.Field;

public class SchoolTest {
    public static void main(String[] args) throws NoSuchFieldException {
        Circliner circliner = new Circliner(12, 12);
//        Class<?> c = circliner.getClass();
        Class<Circliner> c = Circliner.class;
        Field field = c.getDeclaredField("height");
        field.setAccessible(true);

        System.out.println(field.getName());
    }
}
