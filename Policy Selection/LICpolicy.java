package Assignment3Dec9;

import java.util.Scanner;

public class LICpolicy {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("LIC policy");
	   	
        PolicyInterface pi = new InsurancePolicySchemes();
       while(true) {
        System.out.println("Choose your required  Policy");
        System.out.println("Enter 1 = Pension policy");
        System.out.println("Enter 2 = HealthPlans");
        System.out.println("Enter 3 = IndividualPlans");
        System.out.println("Enter 4 = GroupSchemes");
        System.out.println("Enter 5 = Exit");
      
        int policyNum =sc.nextInt();
        switch(policyNum) {
        case 1:
          pi.PensionPlans();
          break;
        case 2:
        	pi.healthPlans();
        	break;
        case 3:
        	pi.individualPlans();
        	break;
        case 4:
        	pi.GroupSchemes();
        	break;
        case 5:
        	break;
       	default:
       		System.out.println("INVALID POLICY CASE NUMBER");
       
         }
        if(policyNum==5) {
        	System.out.println(" THANK YOU ");
          	break;
        }
        else {
        	continue;
        }
	}

}
}
