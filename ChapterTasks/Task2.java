package ChapterTasks;

public class Task2 {
    public static void main(String[] args) {
        // Declare primitives
        byte zero = 0;
        short one = 1;
        int three = 3;
        float twoPointZero = 2.0f;
        char H = 'H';
        char w = 'w';
        boolean isTrue = true;

        // Concatenate into a string
        String output = "" + H + three + one + one + zero + " " + w + zero + "rld " + twoPointZero + " " + isTrue;

        // Print result
        System.out.println(output);
    }
}