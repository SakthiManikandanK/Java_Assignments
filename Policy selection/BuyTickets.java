package Assignment3Dec9;

import java.util.Scanner;

public class BuyTickets {

	static Scanner sc = new Scanner(System.in);
	public  void Tax() {
		
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Zoo");
		System.out.println(" Purchase Ticket");
		System.out.println("Age over 55  : RS 150");
		System.out.println("Age between 21 to 54  : RS 200");
		System.out.println("Age between 13 to 20  : RS 120");
		System.out.println("Age between 3 to 12  : RS 70");
		System.out.println("Age under 3    : NO Charges");

		System.out.println("Enter no. of. Persons : ");

		int numberofperson = sc.nextInt();
		int counter = 1;
		TicketCounter tc = new TicketCounter();

		while (counter <= numberofperson) {
			System.out.println("Enter your Age ");

			int respectiveAge = sc.nextInt();

			
			if (respectiveAge >= 55) {
				tc.RespectiveTickets(respectiveAge);
			} else if (respectiveAge >= 21 && respectiveAge <= 54) {
				tc.RespectiveTickets(respectiveAge);
			} else if (respectiveAge >= 13 && respectiveAge <= 20) {
				tc.RespectiveTickets(respectiveAge);
			} else if (respectiveAge >= 3 && respectiveAge <= 12) {
				tc.RespectiveTickets(respectiveAge);
			} else if (respectiveAge < 3) {
				tc.RespectiveTickets(respectiveAge);
			} else {
				System.out.println("INVALID");
			}
			counter++;

		}

		System.out.println("TOTAL TICKET AMOUMT  : " + tc.getTotalAmount());	
	}
}
