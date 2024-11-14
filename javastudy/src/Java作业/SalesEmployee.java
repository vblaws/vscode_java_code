package Java作业;

public class SalesEmployee extends Employee{
    //月销售额度
    private double monthlySales;
    //提成率
    private double commissionRate;

    public SalesEmployee() {
    }

    public SalesEmployee(double monthlySales, double commissionRate) {
        this.monthlySales = monthlySales;
        this.commissionRate = commissionRate;
    }

    public SalesEmployee(String name, int month, double monthlySales, double commissionRate) {
        super(name, month);
        this.monthlySales = monthlySales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double getSalary(int month) {
        return getMonthlySales()*getCommissionRate()+super.getSalary(month);
    }

    public double getMonthlySales() {
        return monthlySales;
    }

    public void setMonthlySales(double monthlySales) {
        this.monthlySales = monthlySales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return "姓名:"+this.getName() + "\t生日"+this.getBirthday()+"月\t "+"月销售额"+this.getMonthlySales()+"\t 提成率"+this.getCommissionRate();
    }
}
