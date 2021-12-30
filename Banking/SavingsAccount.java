package Assignment1Dec7;

public class SavingsAccount extends AccountClass {

	public void calculatebalance() {

		float ROI=(balance*1*7)/100;
		
	     balance= balance  + ROI;
		
		System.out.println("Available Amount in SavingAccount with 7% interest : "+ balance);

	}
}
