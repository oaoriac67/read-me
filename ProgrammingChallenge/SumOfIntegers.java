package ProgrammingChallenge;

import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        char choice;

        do {
            System.out.print("Enter an integer: ");
            int number = input.nextInt();
            sum += number;

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = input.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("The sum of all integers entered is: " + sum);
        input.close();
    }
}
