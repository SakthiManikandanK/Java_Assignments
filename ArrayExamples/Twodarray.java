package com.sample;

import java.util.Scanner;

public class Twodarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stubpublic static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);

			System.out.println("enter the length");

			int row = sc.nextInt();
			int col = sc.nextInt();
			int a[][] = new int[row][col];
			for (int i = 0; i <= row - 1; i++) {
				for (int j = 0; j <= col - 1; j++)

					a[i][j] = sc.nextInt();

			}
			for (int i = 0; i <= row - 1; i++) {
				for (int j = 0; j <= col - 1; j++)

					System.out.println(a[i][j]);
			}
		}

	}

}
