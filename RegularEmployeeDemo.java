package employee;

public class RegularEmployeeDemo {
    public static void main(String[] args) {
        RegularEmployee regEmp = new RegularEmployee(101, "Dewesh");
        regEmp.setSalary(100000, 15000, 10000);
        regEmp.printDetails(regEmp);
    }
}
