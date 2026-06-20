package ProgrammingChallenge;

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine().trim();

        // Split the sentence by spaces
        String[] words = sentence.split("\\s+");

        // Handle empty input
        if (sentence.isEmpty()) {
            System.out.println("No words entered.");
        } else {
            System.out.println("Number of words: " + words.length);
        }

        input.close();
    }
}
