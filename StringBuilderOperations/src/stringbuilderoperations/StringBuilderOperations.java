
package stringbuilderoperations;

import java.util.Scanner;

public class StringBuilderOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter a string with at least 10 characters: ");
        String input = scanner.nextLine();

       
        if (input.length() < 10) {
            System.out.println("Error: The string must have at least 10 characters.");
            return;
        }

        
        StringBuilder sb = new StringBuilder(input);

       
        System.out.println("1. Length of the string: " + sb.length());

       
        System.out.println("2. First character: " + sb.charAt(0));

       
        System.out.println("3. Last character: " + sb.charAt(sb.length() - 1));

      
        int indexOfA = sb.indexOf("a");
        System.out.println("4. Index of first 'a': " + (indexOfA != -1 ? indexOfA : "Not found"));

     
        if (sb.length() >= 7) {
            System.out.println("5. Substring from index 3 to 6: " + sb.substring(3, 7));
        } else {
            System.out.println("5. Substring from index 3 to 6: Not enough characters.");
        }

      
        sb.append("123");
        System.out.println("6. Appending '123': " + sb.toString());

      
        if (sb.length() >= 4) {
            sb.insert(4, "xyz");
            System.out.println("7. Inserting 'xyz' at index 4: " + sb.toString());
        } else {
            System.out.println("7. Cannot insert at index 4: Not enough characters.");
        }

        
        if (sb.length() >= 4) {
            sb.delete(2, 4);
            System.out.println("8. Deleting index 2 to 4: " + sb.toString());
        } else {
            System.out.println("8. Cannot delete index 2 to 4: Not enough characters.");
        }

        if (sb.length() > 8 ){
            sb.deleteCharAt(8);
            System.out.println("9. Deleting character at index 8: " + sb.toString());
        } else {
            System.out.println("9. Cannot delete character at index 8: String too short.");
        }

       
        sb.reverse();
        System.out.println("10.Reversed string: " + sb.toString());

        scanner.close();
    }
}
