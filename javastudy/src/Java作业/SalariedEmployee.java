package Java作业;
//固定工资员工
public class SalariedEmployee extends Employee {
    private double monthSalary;


    public SalariedEmployee() {
    }

    public SalariedEmployee(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    public SalariedEmployee(String name, int month, double monthSalary) {
        super(name, month);
        this.monthSalary = monthSalary;
    }

    @Override
    public double getSalary(int month) {
        return super.getSalary(month)+getMonthSalary();
    }

    public double getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    @Override
    public String toString() {
        return "姓名:"+this.getName()+"\t 生日:"+this.getBirthday()+"月\t "+"固定工资"+this.getMonthSalary();
    }
}
