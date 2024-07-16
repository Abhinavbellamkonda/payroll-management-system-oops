public class PartTimeEmployee extends Employee{

    private double hoursWorked;
    private double hourlySalary;

    public PartTimeEmployee(String name, int Id, double hoursWorked, double hourlySalary ){
        super(name,Id);
        this.hoursWorked = hoursWorked;
        this.hourlySalary = hourlySalary;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlySalary;
    }
}
