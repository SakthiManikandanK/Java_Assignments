package Basics;

public class BookMyShow {

	public static void main(String[] args) {
		MovieInterface mi =new TicketDetails();
		mi.checkMovieAvailablity();
		mi.checkAvailableTickets();
		mi.displayTicketPrice();
		mi.showTotalAmount();
	}

}
