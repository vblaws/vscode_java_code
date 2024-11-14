package Java作业;
//按小时算工资员工
public class HourlyEmployee extends Employee{
    private double perHourSalary;
    private double hours;

    public HourlyEmployee() {
    }

    public HourlyEmployee(double perHourSalary, double hours) {
        this.perHourSalary = perHourSalary;
        this.hours = hours;
    }

    public HourlyEmployee(String name, int month, double perHourSalary, double hours) {
        super(name, month);
        this.perHourSalary = perHourSalary;
        this.hours = hours;
    }

    @Override
    public double getSalary(int month) {
        if (getHours()>160){
            //工作时长大于160h
            return 160*getPerHourSalary() + (getHours()-160) * 1.5*getPerHourSalary()+super.getSalary(month);
        }else {
            //工作时长小于或等于160h
            return getHours()*getPerHourSalary()+super.getSalary(month);
        }
    }

    public double getPerHourSalary() {
        return perHourSalary;
    }

    public void setPerHourSalary(double perHourSalary) {
        this.perHourSalary = perHourSalary;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "姓名:"+this.getName() + "\t生日"+this.getBirthday()+"\t 每小时工资"+this.getPerHourSalary()+"\t 工作时长"+this.getHours();
    }
}
