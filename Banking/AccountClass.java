
package Assignment1Dec7;

import java.util.Scanner;

public class AccountClass {
	
	Scanner sc = new Scanner(System.in);

	float balance = 0;
	
	//float reqtAmount = sc.nextInt();

	public boolean pin()

	{
		System.out.println("Enter PIN ");

		String ssr = "1234";

		String str = sc.nextLine();

		return ssr.equals(str);

	}

	public void deposit()

	{
		System.out.println("Enter the Amount for deposit   ");

	int 	reqtAmount = sc.nextInt();

		balance = balance + reqtAmount;

		System.out.println("Balance after Deposit :: " + balance);
	}

	public void withdraw()

	{
		System.out.println("Enter the Amount for Withdraw  ");

		int reqtAmount = sc.nextInt();

		if (reqtAmount <= balance) {

			balance = balance - reqtAmount;

			System.out.println("Balance after withdraw :: " + balance);
		} else {
			System.out.println("INVALID AMOUNT");
		}
	}
}
