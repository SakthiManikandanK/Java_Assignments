import java.util.Scanner;

public class RestaurantFoods {
    Scanner sc = new Scanner(System.in);
    int Amount=0;

    public void veg() {

        System.out.println(" please order your food ");
        System.out.println("Press 1 = Full meals ____Rs : 130 ");
        System.out.println("Press 2 = Set Dosa ___RS : 60");
        System.out.println("Press 3 = wheat Parotta___Rs : 75");
        System.out.println("Press 4 = poori Masal___RS : 50");
        System.out.println("Press 5 = idly with 2 vada___RS : 30");
        System.out.println("Press 6 = Exit");

        int order =0;
        int exit = 6;

        FoodCalculation fc = new FoodCalculation();

        while (order != exit) {
            order = sc.nextInt();

            switch (order) {
                case 1:
                    System.out.println("**** Full meals ****");
                    Amount=Amount+fc.calculation(130);
                    System.out.println("Price"+Amount);
                    break;

                case 2:
                    System.out.println("****Set Dosa****");
                   Amount=Amount+fc.calculation(60);
                    System.out.println("Price"+Amount);
                    break;
                case 3:
                    System.out.println("****Wheat Parotta****");
                 Amount=Amount+fc.calculation(75);
                    System.out.println("Price"+Amount);
                    break;
                case 4 :
                    System.out.println("****Poori Masal****");
                    Amount = Amount+fc.calculation(50);
                    System.out.println("Price"+Amount);
                    break;
                case 5:
                    System.out.println("Idly + vada");
                    Amount=Amount+fc.calculation(30);
                    System.out.println("Price"+Amount);
                    break;
                default:
                    System.out.println("Thank you for Visting");

            }


            if(order!=6) {
                System.out.println("To continue please click th Available menu cart number");
                System.out.println("Press 6 to Exit");



            }
        }
    }
    public void Payment(){
        System.out.println("Total Amount : "+Amount);

    }
}
