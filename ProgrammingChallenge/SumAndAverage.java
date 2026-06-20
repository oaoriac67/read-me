package ProgrammingChallenge;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        int[] numbers = new int[n];
        int sum = 0;

        // Input array elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        // Calculate average
        double average = (double) sum / n;

        // Display results
        System.out.println("Sum of numbers: " + sum);
        System.out.println("Average of numbers: " + average);

        input.close();
    }
}
