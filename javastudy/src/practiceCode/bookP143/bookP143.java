package practiceCode.bookP143;

public class bookP143 {
    public static void main(String[] args) {
        Cat cat = new Cat("Java", "12", "21.0", "r=0,g=0,b=0");
        Cat cat1 = new Cat("C++", "12", "21.0", "r=255,g=255,b=255");
        Cat cat2 = new Cat("Java", "12", "21.0", "r=0,g=0,b=0");
        System.out.println(cat);
        System.out.println(cat1);
        System.out.println(cat2);
    }
}