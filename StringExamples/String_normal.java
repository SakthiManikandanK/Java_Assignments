package com.strings;

import java.util.Scanner;

public class String_normal {
	// void Method1() {
	// String a = "sakhti";
	// String b = "smart";
	// String c = a + b;
	// System.out.println(c);
	// }

	// public static void main(String[] args) {
	// System.out.println("START");

	// String_normal SN = new String_normal();
	// SN.Method1();
	// System.out.println("END");
	// }

	// }
	String connnection_of_strings(String x, String y, String z) {
		return x + y + z;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the ip : ");
		String x = scn.next();
		String y = scn.next();
		String z = scn.next();
		

		String_normal Sn = new String_normal();
		String SN = Sn.connnection_of_strings(x, y, z);
		System.out.println("the Name is :" + SN);
	}
}
