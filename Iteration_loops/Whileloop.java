package com.iteration_loops;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		int sum, n, i;
		i = 1;
		sum = 0;
		System.out.println("Enter value for n");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while (i <= n) {
			sum = sum + i;
			i++;
		}
		System.out.println("The sum is "+sum);

	}
}
