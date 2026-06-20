package ProgrammingChallenge;

import java.util.Scanner;

public class StringBuilderExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string (at least 10 characters): ");
        String str = input.nextLine();

        if (str.length() < 10) {
            System.out.println("String must be at least 10 characters long.");
            input.close();
            return;
        }

        StringBuilder sb = new StringBuilder(str);

        // 1. Length of the string
        System.out.println("Length of the string: " + sb.length());

        // 2. First character
        System.out.println("First character: " + sb.charAt(0));

        // 3. Last character
        System.out.println("Last character: " + sb.charAt(sb.length() - 1));

        // 4. Index of first occurrence of 'a'
        System.out.println("Index of 'a': " + sb.indexOf("a"));

        // 5. Substring from index 3 to 6
        System.out.println("Substring (index 3 to 6): " + sb.substring(3, 6));

        // 6. Append "123" to the end
        sb.append("123");
        System.out.println("After append: " + sb);

        // 7. Insert "xyz" at index 4
        sb.insert(4, "xyz");
        System.out.println("After insert: " + sb);

        // 8. Delete substring from index 2 to 4
        sb.delete(2, 4);
        System.out.println("After delete (index 2–4): " + sb);

        // 9. Delete character at index 8
        if (sb.length() > 8) {
            sb.deleteCharAt(8);
            System.out.println("After deleteCharAt(8): " + sb);
        } else {
            System.out.println("String too short to delete character at index 8.");
        }

        // 10. Reverse the string
        sb.reverse();
        System.out.println("Reversed string: " + sb);

        input.close();
    }
}
