import java.util.Comparator;

public class SalaryComp implements Comparator<EmployeeSalary> {
    @Override
    public int compare(EmployeeSalary o1, EmployeeSalary o2) {
        return o1.getSalary().compareTo(o2.getSalary());
    }
}
