package ChapterTasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Create a new StringBuilder to reverse the string
        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();

        // Check if the input string and reversed string are the same
        if (str.equals(reversed)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }

        input.close();
    }
}

