package com.polymorphism;

public class MethodOverriddingBANK {
	float getRateOfInterest ()
	{
		System.out.println("No Interest");
		return 2.0f;
	}
}
	
	class SBI extends MethodOverriddingBANK{
float getRateOfInterest()
		{
			System.out.println("The Interest is : 8");
			return 3.2f;
		}
	}
	class ICICI extends MethodOverriddingBANK {
		float getRateOfInterest()
		{
			System.out.println("the interest is  : 10");
			return 3.5f;
		}

	public static void main(String[] args) {
		//POLYoverridingBANK PB =new SBI();
		MethodOverriddingBANK MOV =new ICICI ();
		SBI sb =new SBI();
	    float op=MOV.getRateOfInterest();
	   // float op2=sb.getRateOfInterest();
	    
	    System.out.println("O/P" + op);
	   //System.out.println("O/P" + op2);
	}

}
