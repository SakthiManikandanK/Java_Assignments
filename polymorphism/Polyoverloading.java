package com.polymorphism;

import java.util.Scanner;

public class Polyoverloading {
	int add(int a, int b){
		return a+b;
	}
	int add(int a, int b,int c) {
		return a + b+ c;
	}

	int add(int a, int b, int c, int d) {
		return a + b + c + d;
	}
		 public static void main(String[] args){
			 Polyoverloading c= new Polyoverloading ();
			 System.out.println("enter four values");
			 Scanner i=new Scanner (System.in);
			 int x=i.nextInt();
			 int x1=i.nextInt();
			 int y=i.nextInt();
			 int y1=i.nextInt();

			  int a = c.add (x,x1);
			  int a1=c.add(x,x1,y);
			  int a2=c.add(x,x1,y,y1);
			//c.add (20,30);
			 // c.add (10,20,30,40);
			 System.out.println("The addition two numbers"+a);
			 System.out.println("the addition of three num:" +a1);
			 System.out.println("the addition of four num:"+a2);
		 }
	 }

		 
	 



	



