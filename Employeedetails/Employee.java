public class Employee {
    int id ;
    String name;
    String dept;
    String salary;
    String DOJ;
    int age;

    public Employee(int id, String name, String dept, String salary, String DOJ, String country, String mobile, String mail_id,int age) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.DOJ = DOJ;
        this.age=age;
        this.country = country;
        this.Mobile  = mobile;
        this.mail_id = mail_id;
    }

    String country;
    String Mobile;
    String mail_id;



    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary='" + salary + '\'' +
                ", DOJ='" + DOJ + '\'' +
                ", country='" + country + '\'' +
                ", Mobile='" + Mobile + '\'' +
                ", mail_id='" + mail_id + '\'' +
                ", age='" + age+ '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDOJ() {
        return DOJ;
    }

    public void setDOJ(String DOJ) {
        this.DOJ = DOJ;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getMail_id() {
        return mail_id;
    }

    public void setMail_id(String mail_id) {
        this.mail_id = mail_id;
    }


}
