package Assignment1Dec7;

import java.util.Scanner;

public class checkingAccounts extends AccountClass {
    Scanner ss = new Scanner(System.in);
	public void Test () {
	    float withdrawAmount = ss.nextFloat();
	    if(withdrawAmount>50000) {
	    balance=(balance-withdrawAmount)-(((balance-withdrawAmount)/10000)*5) ;
	    System.out.println("WithDrawn the Amount above 50000");
	    System.out.println("********************************");
	    System.out.println("The dedcut fee for every (RS:10000) above RS:50000 is RS:5");
	    System.out.println("Withdrawn AmountS = " +withdrawAmount  );
	    System.out.println("Available Amount in CheckingAccount" + balance);
	    }else {
	    	System.out.println("withDrawnAmount"+ withdrawAmount);
	    	   System.out.println("Available Amount in CheckingAccount" + (balance-withdrawAmount));
	    }
 
    
	}

}
