package AssignmentsUptoJan3;

import java.util.Random;
import java.util.Scanner;



public class ThrowingDice {

	static Scanner sc = new Scanner(System.in);
	
	public void Winnings() {
		int UserCounts = 0;
		int ComputerCounts = 0;
		
		for (int round = 1; round <= 10; round++) {
			Random rand = new Random();
			System.out.println("Enter User i/p :");
			int User = sc.nextInt();
			int Computer = rand.nextInt(6) + 1;
			if(User<=6) {
			System.out.println("Enter Computer i/p :" + Computer);
			System.out.println("Round " + round);
			if (User > Computer) {
				System.out.println("User wins in this Round" + round);
				UserCounts++;
			} else if (Computer > User) {
				System.out.println("Computer wins this Round" + round);
				ComputerCounts++;
			} else if (Computer == User) {
				System.out.println("No one wins in this Round" + round);
			}
			}
			else {
				System.out.println("Invalid input");
			}
			if (UserCounts > ComputerCounts) {
				System.out.println("******User wins the Game******");
			} else {
				System.out.println("******Computer wins the Game******");
			}
		}
		System.out.println("Overall User wins :"+UserCounts);
		System.out.println("Overall Computer wins :"+ComputerCounts);
	if(UserCounts>ComputerCounts) {
		System.out.println("User Wins thw game ");
	}
	else {
		System.out.println("Computer wins the Game");
	}
	}

	}

