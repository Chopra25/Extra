package employee;

public class AdHocEmployeeDemo {
    public static void main(String[] args) {
        AdHocEmployee adHocEmp = new AdHocEmployee(101, "Dewesh");
        adHocEmp.setSalary(100000, 15000, 0);
        adHocEmp.printDetails(adHocEmp);
    }
}
