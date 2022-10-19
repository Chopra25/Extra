package employee;

public class AdHocEmployee extends ContractualEmployee {
    public AdHocEmployee(int id, String name) {
        super.id = id;
        super.name = name;
    }

    @Override
    public double getSalary(double base, double da, double hra) {
        return base + da;
    }
}
