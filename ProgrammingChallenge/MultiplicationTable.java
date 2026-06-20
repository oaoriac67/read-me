package ProgrammingChallenge;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Multiplication Table 10x10\n");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j); // formatted for alignment
            }
            System.out.println();
        }
    }
}
