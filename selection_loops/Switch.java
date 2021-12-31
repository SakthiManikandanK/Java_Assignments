package com.selection_loops;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, x, y, z;
		while (true) {

			System.out.println("Enter 2 numbers x and y");
			x = sc.nextInt();
			y = sc.nextInt();
			System.out.println("Enter the case value");
			System.out.println("1=add");
			System.out.println("2=sub");
			System.out.println("3=multiply");
			a = sc.nextInt();

			  switch (a) {
				  case 1:
					  z = x + y;
			          System.out.println("The sum of x and y " + z);
			       break;
			       case 2:
					   z = x - y;
					   System.out.println("the sub of x and y" + z);
					  break;
				  case 3:
					  z=x*y;
					  System.out.println("The multiply of x and y"+z);
					  break;
			       default:
				      System.out.println("it is invaild");
			  }



		}
	}

}
