package ProgrammingChallenge;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if zero
        if (number == 0) {
            System.out.println("The number is zero.");
        } else {
            // Check positive or negative
            if (number > 0) {
                System.out.println("The number is positive.");
            } else {
                System.out.println("The number is negative.");
            }

            // Check odd or even
            if (number % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
        }

        input.close();
    }
}

