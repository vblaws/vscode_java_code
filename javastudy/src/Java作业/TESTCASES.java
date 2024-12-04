package Java作业;

import java.util.ArrayList;

public class TESTCASES<E>{
    private String name;
    private int age;
    private ArrayList<E> list =new ArrayList<>();

    public TESTCASES() {
    }

    public TESTCASES(String name, int age, ArrayList<E> list) {

        this.name = name;
        this.age = age;
        this.list = list;
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

    public ArrayList<E> getList() {
        return list;
    }

    public void setList(ArrayList<E> list) {
        this.list = list;
    }
}
