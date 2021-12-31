package com.strings;

import java.util.Scanner;

public class Arrary {

	public static void main(String[] args) 
	{
	Scanner sc =new Scanner(System.in); 
	
    System.out.println("enter the length");
    
    int l= sc.nextInt();
    int a[]=new int[l]; 
    
    for (int i=0;i<=l-1;i++)
{
	 a[i]= sc.nextInt();
	
}
    for(int i=0;i<=l-1;i++)
{
	System.out.println(a[i]);
}
	}

}
