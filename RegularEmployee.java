package employee;

public class RegularEmployee extends Employee {
    public RegularEmployee(int id, String name) {
        super.id = id;
        super.name = name;
    }

    @Override
    public double getSalary(double base, double da, double hra) {
        return base + da + hra;
    }
}
