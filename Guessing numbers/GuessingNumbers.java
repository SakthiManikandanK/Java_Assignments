package AssignmentsUptoJan3;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumbers {

	Scanner sc = new Scanner(System.in);

	public void Numbers() {
		boolean winningflag = false;
		Random ran = new Random();
		int high = 150;
		int low = 50;
		int computer = ran.nextInt(high - low) + low;
        
		for (int round = 1; round <= 7; round++) {
			System.out.println("Enter the Number");
			int player = sc.nextInt();
			if (player != computer) {
				if (player > computer) {
					System.out.println("TOO high");
				} else {
					System.out.println("TOO low");
				}
			} else {
				winningflag = true;
				System.out.println("Wins the game");
				break;
			}
		}
		if(winningflag==false) {
		System.out.println("Loss the Game");
		}
	}
}
