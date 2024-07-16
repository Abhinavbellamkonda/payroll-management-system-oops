abstract class Employee {

    private String name;
    private int Id;

    public Employee(String name, int Id){
        this.name = name;
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                '}';
    }

    public static void main(String[] args) {


        PayrollSystem payrollSystem = new PayrollSystem();
        payrollSystem.addEmployee(new FullTimeEmployee("Abhi", 1,70000));
        payrollSystem.addEmployee(new FullTimeEmployee("Alvin", 2,80000));
        payrollSystem.addEmployee(new PartTimeEmployee("Arun", 3,120,20));
        payrollSystem.addEmployee(new PartTimeEmployee("Ashish", 4,90,30));
        payrollSystem.addEmployee(new FullTimeEmployee("Anil", 5,55000));
        payrollSystem.allEmployess();
        System.out.println();
        payrollSystem.removeEmployee(5);
        System.out.println("After removing the employee with Id 5");
        System.out.println();
        payrollSystem.allEmployess();
        System.out.println();

        System.out.println(payrollSystem.checkEmployee("Abhi"));


    }
}
