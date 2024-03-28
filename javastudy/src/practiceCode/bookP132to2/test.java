package practiceCode.bookP132to2;

import java.io.PrintStream;

import org.junit.Test;

public class test {
    public static void main(String[] args) {
        flies f1 = new flies(6);
        System.out.println("苍蝇有" + f1.getLegs() + "条腿");
        f1.flyable();
        f1.reproduce();
        PrintStream printStream = System.out;
        printStream.println("aw");
    }
}
