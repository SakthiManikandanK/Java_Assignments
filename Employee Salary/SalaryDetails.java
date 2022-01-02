import java.util.Collections;
import java.util.HashSet;

public class SalaryDetails {
    public static void salary() {
        HashSet<EmployeeSalary> emp_set = new HashSet<EmployeeSalary>();
        emp_set.add(new EmployeeSalary(1, "sakthi", 25, "production", "01122021", 33000.00));
        emp_set.add(new EmployeeSalary(2, "Manikandan", 24, "Maintanence", "01122021", 32000.00));
        emp_set.add(new EmployeeSalary(3, "Smart", 30, "QC", "01122021", 40000.00));
        emp_set.add(new EmployeeSalary(4, "Jishu", 21, "QA", "01122021", 22000.00));
        emp_set.add(new EmployeeSalary(5, "Muruga", 40, "production Head", "01122021", 55000.00));
        emp_set.add(new EmployeeSalary(6, "sai", 29, "production", "01122021", 35000.00));
        for (EmployeeSalary es : emp_set){
            if(es.getSalary()>30000){
                System.out.println("Employee's getting salary above 30000" +es);
            }
        }
        Collections.max(emp_set,new SalaryComp());
        System.out.println("**************************************************************************************");
        System.out.println("Employee getting Highest Salary "+  Collections.max(emp_set,new SalaryComp()));
        Collections.min(emp_set,new SalaryComp());
        System.out.println("**************************************************************************************");
        System.out.println("Employee Getting lower Salary"+  Collections.min(emp_set,new SalaryComp()));
    }
            public static void main (String[] args){
            salary();
        }
        }
