
package vowelconsonants;

import java.util.Scanner;

public class VowelConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter A Single Character: ");
        String input = scanner.nextLine();

       
        if (input.length() != 1) {
            System.out.println("Invalid input. Please enter exactly one character.");
        } else {
            char ch = input.charAt(0);

         
            if (Character.isLetter(ch)) {
               
                char lowerChar = Character.toLowerCase(ch);

                
                if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u') {
                    System.out.println(ch + " is a vowel.");
                } else {
                    System.out.println(ch + " is a consonant.");
                }
            } else {
                System.out.println("Invalid input. Not a letter.");
            }
        }

        scanner.close();
    }
}
