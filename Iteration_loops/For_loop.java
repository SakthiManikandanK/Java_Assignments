package com.iteration_loops;

import java.util.Scanner;

public class For_loop {

	
	public static void main(String[] args) {
			int sum, n, i;
			i = 5;
			sum=0;
			System.out.println("Enter value for n");
			System.out.println("Enter above  5 : ");
			Scanner sc = new Scanner (System.in);
			n=sc.nextInt();
			for(i=5;i<=n;i++) {
				sum = sum + i;
				
			}
			System.out.println(sum);
			if(sum>=5)
			{
				
					System.out.println("The answer is : " + sum);
			}else
            System.out.println(" if  you give less than 5 is answer is 0...");
		}

	
	}


	


