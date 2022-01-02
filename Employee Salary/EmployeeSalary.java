import java.util.Date;

public class EmployeeSalary {
    int id;
    String name;
    int Age;
    String Dept;
    String DOJ;
    Double salary;

    @Override
    public String toString() {
        return "EmployeeSalary{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Age=" + Age +
                ", Dept='" + Dept + '\'' +
                ", DOJ='" + DOJ + '\'' +
                ", salary=" + salary +
                '}';
    }

    public EmployeeSalary(int id, String name, int age, String dept, String DOJ, Double salary) {
        this.id = id;
        this.name = name;
        Age = age;
        Dept = dept;
        this.DOJ = DOJ;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public String getDOJ() {
        return DOJ;
    }

    public void setDOJ(String DOJ) {
        this.DOJ = DOJ;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


}
