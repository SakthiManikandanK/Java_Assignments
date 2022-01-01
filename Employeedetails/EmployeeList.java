import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeList {
    public static void list() {
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(1, "sakthi", "QC", "25000", "07022021", "Brazil", "8830001112", "sakthi@", 25));
        employeeList.add(new Employee(2, "Manikandan", "maintenance", "25000", "07022021", "America", "8830001112", "virat@", 40));
        employeeList.add(new Employee(3, "smart", "QA", "25000", "07022021", "USA", "8830001112", "sakthi@", 30));
        employeeList.add(new Employee(4, "sai", "QC", "25000", "07022021", "Russia", "8830001112", "Virat@", 45));
        employeeList.add(new Employee(5, "kannan", "Production", "25000", "07022021", "india", "8830001112", "Virat@", 43));
        employeeList.add(new Employee(6, "krishnan", "Manager", "25000", "07022021", "USA", "8830001112", "Virat@", 41));
        employeeList.add(new Employee(7, "jishu", "supervisior", "25000", "07022021", "Germnay", "8830001112", "Virat@", 44));
        employeeList.add(new Employee(8, "rao", "manager", "25000", "07022021", "USA", "8830001112", "Virat@", 40));


        for (Employee e : employeeList) {
            if (e.getAge() > 40) {
                System.out.println("Going to print employee age over 40 :");
                System.out.println(e);
            }
            if (e.getCountry().equalsIgnoreCase("usa")){
                System.out.println("Employee from USA :");
                System.out.println(e);
            }
        }
        CountryCompartor cc = new CountryCompartor();
        Collections.sort(employeeList, cc);
        System.out.println(employeeList);
    }

    public static void main(String[] args) {
        list();
    }
}
