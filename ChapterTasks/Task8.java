package ChapterTasks;

public class Task8 {
    public static void main(String[] args) {
        // Example call
        calculateSum(4, 5, 10);
    }

    // Method with variable arguments
    public static void calculateSum(int... numbers) {
        int totalSum = 0;

        for (int num : numbers) {
            int cumulative = 0;
            for (int i = 1; i <= num; i++) {
                cumulative += i;
            }
            System.out.println("Cumulative sum up to " + num + " = " + cumulative);
            totalSum += cumulative;
        }

        System.out.println("Total sum of all cumulative values = " + totalSum);
    }
}

