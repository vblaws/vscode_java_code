package Java作业;

public class test {
    public static void main(String[] args) {

        int month=2;

        Employee[] arr = new Employee[5];
        arr[0] = new Employee("王五",12);
        arr[1] = new SalariedEmployee("固定工资员工",2,5000);
        arr[2] = new HourlyEmployee("按小时拿工资员工",2,10,161);
        arr[3] = new SalesEmployee("按提成算工资员工",4,10000,0.7);
        arr[4] = new BasePlusSalesEmployee("按固定底薪和提成算员工",8,9000,0.5,1000);
        //二月工资
        for (int i = 0; i < arr.length; i++) {
            Employee e = arr[i];
            System.out.println(e.toString()+"\n "+month+"月工资 "+e.getSalary(month));
        }
    }
}
