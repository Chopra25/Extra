package employee;

public abstract class Employee {
    protected int id;
    protected String name;

    protected double base;
    protected double da;
    protected double hra;

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public abstract double getSalary(double base, double da, double hra);
    public void setSalary(double base, double da, double hra) {
        this.base = base;
        this.da = da;
        this.hra = hra;
    }

    public void printDetails(Employee emp) {
        System.out.println("ID: " + this.id +
                "\nName: " + this.name +
                "\nsalary: " + this.getSalary(emp.base, emp.da, emp.hra));
    }
}
