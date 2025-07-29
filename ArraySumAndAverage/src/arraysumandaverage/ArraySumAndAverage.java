
package arraysumandaverage;
import java.util.Scanner;

public class ArraySumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter The Number Of Elements: ");
        int size = scanner.nextInt();

     
        int[] numbers = new int[size];

      
        System.out.println("Enter " + size + " Integer Values:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

       
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        double average = (size > 0) ? (double) sum / size : 0;

       
        System.out.println("\nSum Of Array Elements: " + sum);
        System.out.println("Average Of Array Elements: " + average);

        scanner.close();
    }
}