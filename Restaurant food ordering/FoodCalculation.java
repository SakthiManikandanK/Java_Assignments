import java.util.Scanner;

public class FoodCalculation {
    Scanner sc= new Scanner(System.in);
    int quantity;
    int price;

    public  int calculation(int i){
        System.out.println("Quantity:");
        quantity=sc.nextInt();
        price=quantity*i;
        return price;

    }
}
