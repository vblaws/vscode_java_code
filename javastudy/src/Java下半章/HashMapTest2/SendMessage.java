package Java下半章.HashMapTest2;

@FunctionalInterface
public interface SendMessage {
    void sayMessage(String message);

    default void doSomething() {
        System.out.println("这是一个默认方法");
    }
}
