
package task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String input = scanner.nextLine();


        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();


        if (input.equals(reversed)) {
            System.out.println("The Input String is a Palindrome.");
        } else {
            System.out.println("The Input String is Not a Palindrome.");
        }

        scanner.close();
    }
}
