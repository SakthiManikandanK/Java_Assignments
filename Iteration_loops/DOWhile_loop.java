package com.iteration_loops;

import java.util.Scanner;

public class DOWhile_loop {

	public static void main(String[] args) {
		int i;
		Scanner Sc =new Scanner (System.in);
		System.out.println("Enter ur i/p");
		i=Sc.nextInt();
	
	do
	{
		System.out.println(i);
		i++;
	}while(i<4);
	}
}


