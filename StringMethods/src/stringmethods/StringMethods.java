
package stringmethods;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter A String: ");
        String input = scanner.nextLine();

       
        int length = input.length();
        System.out.println("1. Length Of The String: " + length);

       
        System.out.println("2. Uppercase: " + input.toUpperCase());

      
        System.out.println("3. Lowercase: " + input.toLowerCase());

      
        if (length >= 1) {
            System.out.println("4. First Character: " + input.charAt(0));
        } else {
            System.out.println("4. First Character: (String is empty)");
        }

     
        if (length >= 1) {
            System.out.println("5. Last Character: " + input.charAt(length - 1));
        } else {
            System.out.println("5. Last Character: (String is empty)");
        }

        if (length >= 5) {
            System.out.println("6. Substring (2nd to 5th Char): " + input.substring(1, 5));
        } else if (length > 1) {
            System.out.println("6. Substring (2nd to end): " + input.substring(1));
        } else {
            System.out.println("6. Substring: Not enough characters.");
        }

        scanner.close();
    }
}