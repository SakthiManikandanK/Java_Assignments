package Assignment1Dec7;

import java.util.Scanner;

public class getBalance {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(" WELCOME TO NETBANKING");
		System.out.println("Choose the Account type  :");
		System.out.println("1 = SavingsAccount  ;  2 = CheckingsAccount");
		int Accountchoosing = sc.nextInt();
		int toSavingsAccount = 1;

		if (toSavingsAccount == Accountchoosing) {
			SavingsAccount sa = new SavingsAccount();
			if (sa.pin()) {
				System.out.println("Click 1 for  : Deposit");
				System.out.println("Click 2 for  : Withdraw");
				int option = sc.nextInt();
				switch (option) {
				case 1:
					sa.deposit();
					break;
				case 2:
					sa.withdraw();
					break;
				default:
					System.out.println("INVAILD NUMBER");

				}
			} else {
				System.out.println(" WRONG PIN");
			}
			sa.calculatebalance();
		}

		else {
			checkingAccounts ca = new checkingAccounts();
			if (ca.pin()) {
				System.out.println("Click 1 for  : Depost");
				System.out.println("Click 2 for  : Withdraw");
				int i = sc.nextInt();
				switch (i) {
				case 1:
					ca.deposit();
					break;
				case 2:
					ca.withdraw();
					break;
				default:
					System.out.println("INVAILD NUMBER");

				}
			} else {
				System.out.println(" WRONG PIN");
			}
			System.out.println("Enter the Amount to withdraw in CheckingAccount");
			ca.Test();

		}
	}
}