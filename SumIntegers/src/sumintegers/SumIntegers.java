
package sumintegers;

import java.util.Scanner;

public class SumIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter Integers To Sum.:");

       
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            sum += number;
        }

        System.out.println("The Total Sum is: " + sum);
        scanner.close();
    }
}