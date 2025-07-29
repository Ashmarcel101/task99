
package task8;

public class Task8 {


    public static int cumulativeSum(int... numbers) {
        int totalSum = 0;

        for (int num : numbers) {
            int singleSum = 0;

            for (int i = 1; i <= num; i++) {
                singleSum += i;
            }

            System.out.println("Sum Up To " + num + " = " + singleSum);
            totalSum += singleSum;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        // Example input
        int result = cumulativeSum(4, 5, 10);
        System.out.println("Total Cumulative sum = " + result);
    }
}