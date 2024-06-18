package 常见算法.五道算法题.T1;

public class GirlFriend {
     private String name;
     private int age;

     public GirlFriend() {

     }

     public GirlFriend(String name, int age, int height) {
          this.name = name;
          this.age = age;
          this.height = height;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public int getAge() {
          return age;
     }

     public void setAge(int age) {
          this.age = age;
     }

     public int getHeight() {
          return height;
     }

     public void setHeight(int height) {
          this.height = height;
     }

     private int height;

     @Override
     public String toString() {
          return "GirlFriend [name=" + name + ", age=" + age + ", height=" + height + "]";
     }

}
