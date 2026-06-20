package ChapterTasks;

import static java.lang.Math.*;

public class Task9 {

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static int divide(int a, int b) {
        return floorDiv(a, b);
    }

    public static void main(String[] args) {
        int x = 6;
        int y = 7;

        System.out.println("Addition: " + add(x, y));
        System.out.println("Subtraction: " + subtract(x, y));
        System.out.println("Multiplication: " + multiply(x, y));
        System.out.println("Division (floor): " + divide(x, y));
    }
}
