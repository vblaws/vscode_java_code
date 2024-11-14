package Java作业;
//提成加底薪员工
public class BasePlusSalesEmployee extends SalesEmployee{
    private double basicSalary;

    public BasePlusSalesEmployee() {
    }

    public BasePlusSalesEmployee(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public BasePlusSalesEmployee(double monthlySales, double commissionRate, double basicSalary) {
        super(monthlySales, commissionRate);
        this.basicSalary = basicSalary;
    }

    public BasePlusSalesEmployee(String name, int month, double monthlySales, double commissionRate, double basicSalary) {
        super(name, month, monthlySales, commissionRate);
        this.basicSalary = basicSalary;
    }

    @Override
    public double getSalary(int month) {
        return super.getSalary(month)+getBasicSalary();
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
}
