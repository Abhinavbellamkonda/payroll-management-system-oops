import javax.swing.event.ListDataEvent;
import java.util.ArrayList;


public class PayrollSystem {

    private ArrayList<Employee> employeeArrayList;

    public PayrollSystem(){
        employeeArrayList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeArrayList.add(employee);
    }

    public void removeEmployee(int Id){
        Employee employeeToRemove = null;

        for(Employee employee : employeeArrayList){
            if(employee.getId() == Id){
                employeeToRemove = employee;
            }
        }

        if(employeeToRemove!=null){
            employeeArrayList.remove(employeeToRemove);
        }

        System.out.println("Employee removed sucessfully");
    }

   public void allEmployess(){
       employeeArrayList.forEach(x -> System.out.println(x));
   }


   public boolean checkEmployee(String name){

       Employee employeeToCheck = null;

       for(Employee employee : employeeArrayList){
           if(employee.getName() == name){
               employeeToCheck = employee;
           }
       }

       if(employeeToCheck!=null){
           return true;
       }
       return false;
   }
}
