package practiceCode.bookP143;

public class Cat {
    private String name;
    private String age;
    private String weight;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat(String name, String age, String weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public Cat() {

    }

    @Override
    public String toString() {
        return "姓名" + name + "\n" + "年龄" + age + "\n" + "重量" + weight + "\n" + "颜色:java.awt.Color[" + color + "]"
                + "\n";
    }
}
