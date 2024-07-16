public class FullTimeEmployee extends Employee {

    private double monthlySalary;

    public FullTimeEmployee(String name, int Id, double monthlySalary){
        super(name,Id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
