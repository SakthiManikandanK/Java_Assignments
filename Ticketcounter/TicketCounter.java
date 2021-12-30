package Assignment3Dec9;

public class TicketCounter {

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	int totalAmount;

	public void RespectiveTickets(int yourAge) {
		int ticketPrice = 0;
		if (yourAge >= 55) {
			ticketPrice = 150;
			System.out.println("TicketPrice for older people  : " + ticketPrice);
		} else if (yourAge >= 21 && yourAge <= 54) {
			ticketPrice = 200;
			System.out.println("TicketPrice for Adults  :" + ticketPrice);
		} else if (yourAge >= 13 && yourAge <= 20) {
			ticketPrice = 120;
			System.out.println("TicketPrice for Teens :" + ticketPrice);
		} else if (yourAge >= 3 && yourAge <= 12) {
			ticketPrice = 70;
			System.out.println("TicketPrice for kids  :" + ticketPrice);
		} else if (yourAge > 0 && yourAge < 3) {
			ticketPrice = 0;
			System.out.println("TicketPrice for under 3 Age  :" + ticketPrice);
		} else {
			System.out.println("INVALID AGE");
		}
		this.totalAmount = this.totalAmount + ticketPrice;
		
	}
	
}
