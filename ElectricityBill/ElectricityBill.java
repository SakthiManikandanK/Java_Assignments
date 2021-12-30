package Assignment2Dec8;

public class ElectricityBill {

	double billingAmount;
	

	public void calculateElectricBill(int units) {
		if (units <= 100) {
			billingAmount = 0;
			System.out.println("Elecricuty Bill = " + billingAmount);
		} else if (units > 100 && units <= 200) {
			billingAmount = 100 * 0 + (units - 100) * 1.5;
			System.out.println("Elecricuty Bill = " + billingAmount);
		} else if (units > 200 && units <= 500) {
			billingAmount = 100 * 0 + 100 * 2 + (units - 200) * 3;
			System.out.println("Elecricuty Bill = " + billingAmount);
		} else if (units > 500) {
			billingAmount = 100 * 0 + 100 * 3.5 + 300 * 4.6 + (units - 500) * 6.6;
			System.out.println("Elecricuty Bill = " + billingAmount);
		} else {
			System.out.println("Invaild Units");
			System.out.println("Contact Electricity Board");
		}
	}

}
