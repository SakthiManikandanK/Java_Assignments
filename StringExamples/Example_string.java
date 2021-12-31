package com.strings;

public class Example_string {
	
	
	String addition_of (String a,String b){
		
		return a + b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  a="hello";
		String  b="world";
		

		Example_string ES=new Example_string();
         String c=ES.addition_of(a, b);
         System.out.println("The concat of :" +c);

	}

}
