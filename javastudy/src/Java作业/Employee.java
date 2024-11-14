package Java作业;
//普通员工
public class Employee {
    private String name;
    private int birthday;

    public Employee() {
    }


    public Employee(String name, int birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public double getSalary(int month){
        double salary=0;
        return month == getBirthday() ? salary + 100 : salary ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString(){
        return "姓名:"+this.getName() + "\t生日"+this.getBirthday();

    }
}
