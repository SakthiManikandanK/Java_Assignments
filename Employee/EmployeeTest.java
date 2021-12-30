package Assignment1Dec7;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee em = new Employee();
		em.setFirstName("sakthi");
		em.setLastName("K");
        em.setEmpId("s01");
        em.setMonthlySalary(20000);
        
        System.out.println("FirstName  :  "+em.getFirstName());
        System.out.println("LastName  :  "+em.getLastName());
        System.out.println("Employee Id  :  "+em.getEmpId());
        System.out.println("MonthlySalary  :  "+em.getMonthlySalary());
         
        calcYearlySalary(em);
       
        System.out.println("......................................");
        
        Employee em1 = new Employee();
        em1.setFirstName("Manikandan");
        em1.setLastName("K");
        em1.setEmpId("s02");
        em1.setMonthlySalary(25000);
        
        System.out.println("FirstName  :  "+em1.getFirstName());
        System.out.println("LastName  :   "+em1.getLastName());
        System.out.println("Employee Id  :  "+em1.getEmpId());
        System.out.println("MonthlySalary  :  "+em1.getMonthlySalary());
 
        calcYearlySalary(em1);
	}
	public static void calcYearlySalary (Employee employe) {
		
		long yearlysalary = employe.getMonthlySalary()*12;
		
		System.out.println("Yearly salary of  " + employe.getFirstName() + "is " + yearlysalary);
		
		System.out.println("Yearly salary After 10% Raised"+(employe.getMonthlySalary()*12+employe.getMonthlySalary()/100*10));
	}

}
