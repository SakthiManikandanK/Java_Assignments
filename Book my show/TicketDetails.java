package Basics;

import java.util.Scanner;

public  class TicketDetails implements MovieInterface {
	int req_tkts;
	double GST = 2.0;
	int ticketPrice=150;
	public void checkMovieAvailablity() {
		System.out.println("Choose the movie : 1=valimai :: 2= Beast :: 3= Vikram");
		Scanner sc = new Scanner(System.in);

		System.out.println("choose the number::");
		int i = sc.nextInt();

		switch (i) {
		case 1:
			System.out.println("Movie Name : valimai");
			break;
		case 2:
			System.out.println("Movie Name : Beast");
			break;
		case 3:
			System.out.println("Movie Name : Vikram");
			break;
		default:
			System.out.println("Invalid Input");
		}
	}

	public void checkAvailableTickets() {
		System.out.println("Available seats = 5");
		System.out.println(" Book the movie seats:: ");
		System.out.println("  ");
		Scanner ss = new Scanner(System.in);
	    req_tkts = ss.nextInt();
		int avble_tkts = 5;
		if (req_tkts!=0 && req_tkts<=avble_tkts ) {
			System.out.println("Seats Booked");
		}
		else {
			System.out.println("  NO SEATS!!!  ");
		}
	}
	public void displayTicketPrice() {
		if(req_tkts<=5) {
		System.out.println("......................................");
		System.out.println("Price of 1 movie ticket = 150");
		System.out.println("GST=2");
		System.out.println("......................................");
		}
		else {
			System.out.println(" Thanks for Visiting ");
		}
	}
	public void showTotalAmount() {
		if(req_tkts<=5) {
		double totalAmount = req_tkts *(( ticketPrice * GST/100)+ticketPrice);
		System.out.println("TOTAL AMOUNT" + totalAmount );
	}else {
		System.out.println("Welcome");
	}

}
}
