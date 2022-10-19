package employee;

public class TermEmployee extends ContractualEmployee {
    public TermEmployee(int id, String name) {
        super.id = id;
        super.name = name;
    }

    @Override
    public double getSalary(double base, double da, double hra) {
        return base * 30.0 + da;
    }
}
