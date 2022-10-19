package employee;

public class TermEmployeeDemo {
    public static void main(String[] args) {
        TermEmployee termEmp = new TermEmployee(101, "Dewesh");
        termEmp.setSalary(1000, 50, 0);
        termEmp.printDetails(termEmp);
    }
}
