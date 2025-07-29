import java.util.Scanner;

public class Counting {

    public void Sukli() {
	System.out.println("					"+"*************************");
	System.out.println("					"+"*	Counting System     *");
	System.out.println("					"+"*************************");
        Scanner keyboard = new Scanner(System.in);
        int price;
        int provided;
        int change;
        System.out.print("Enter the purchase price:");
        price = (int) Math.round(keyboard.nextDouble() * 100);
        System.out.print("Enter the amount given by the customer:");
        provided = (int) Math.round(keyboard.nextDouble() * 100);
   
        if (provided > price) {
            System.out.println("The change is: " + ((provided - price)/100.00));
            System.out.println("The customer should be given the change as follows:");
            change = provided - price;
            
            int twenties = change / 2000;
            
            if (twenties > 0) { 
                change = change % 2000; 
                
                System.out.println(twenties + " P20 bill(s)");
            }
            
            int tens = change / 1000;
            if (tens > 0) {
                change = change % 1000;
                System.out.println(tens + " P10 bill(s)");
            }
            
            int fives = change / 500;
            if (fives > 0) {
                change = change % 500;
                System.out.println(fives + " P5 coin(s)");
            }
            
            int ones = change / 100;
            if (ones > 0) {
                change = change % 100;
                System.out.println(ones + " P1 coin(s)");
            }
            
            int quarters = change / 25;
            if (quarters > 0) {
                change = change % 25;
                System.out.println(quarters + " quarter cents(s)");
            }
            
            int dimes = change / 10;
            if (dimes > 0) {
                change = change % 10;
                System.out.println(dimes + " dime cents(s)");
            }
            
            int nickels = change / 5;
            if (nickels > 0) {
                change = change % 5;
                System.out.println(nickels + " nickel cent(s)");
            }
            int pennies = change;
            System.out.println(pennies + " penny cent(s)");
        }
        if (provided < price) { 
            
            System.out.print("Not enough money!");
        } else if (provided == price) { 
           
           
            System.out.print("No change is necessary!");
        }
    }
}


