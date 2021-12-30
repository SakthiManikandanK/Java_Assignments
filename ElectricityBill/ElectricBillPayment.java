package Assignment2Dec8;

import java.util.Scanner;

public class ElectricBillPayment {
 
	public static void main(String[] args) {
		Scanner sr =new Scanner(System.in);
		System.out.println("Enter the Amount of Usedunits  :");
		int usedunits = sr.nextInt(); 
		ElectricityBill ec= new ElectricityBill();
		ec.calculateElectricBill(usedunits);
	

	}

}
