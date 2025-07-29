
package wordcounter;

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter A Sentence: ");
        String input = scanner.nextLine();

    
        if (input.trim().isEmpty()) {
            System.out.println("The input contains 0 words.");
        } else {
         
            String[] words = input.trim().split("\\s+");
            System.out.println("The Input Contains " + words.length + " Word(s).");
        }

        scanner.close();
    }
}