package JavaP158;

import java.io.IOException;

public class JavaP158 {
    public static void main(String[] args) throws IOException {
        // API-Runtime
        // 两个获取的是同一个对象,地址值相同
        Runtime runtime = Runtime.getRuntime();
        Runtime runtime2 = Runtime.getRuntime();
        System.out.println(runtime == runtime2);
        // 停止虚拟机
        // 获取CPU线程数
        System.out.println("CPU线程数为" + runtime.availableProcessors());
        // 获取JVM能从系统中获取总内存大小
        System.out.println("JVM能从系统中获取总内存大小" + runtime.maxMemory() / 1024 / 1024 + "MB");
        // 获取去JVM已经从系统中获取总内存大小
        System.out.println("JVM已经从系统中获取总内存大小" + runtime.totalMemory() / 1024 / 1024 + "MB");
        // 获取JVM剩余内存大小
        System.out.println("JVM剩余内存大小" + runtime.freeMemory() / 1024 / 1024 + "MB");
        // 运行cmd命令
        // runtime.exec(new String[] { "shutdown", "-s", "-t", "100" });
        runtime.exec(new String[] { "notepad" });

    }

}
