
package number;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        System.out.print("Enter A Number: ");
        
     
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

           
            if (number > 0) {
                System.out.println("The Number Is Positive.");
            } else if (number < 0) {
                System.out.println("The Number Is Negative.");
            } else {
                System.out.println("The Number Is Zero.");
            }

       
            if (number % 2 == 0) {
                System.out.println("The Number Is Even.");
            } else {
                System.out.println("The Number Is Odd.");
            }
        } else {
            System.out.println("Invalid Input. Please Enter An Integer.");
        }

        scanner.close();
    }
}