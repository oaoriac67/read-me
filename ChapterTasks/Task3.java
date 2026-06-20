package ChapterTasks;

public class Task3 {
    public static void main(String[] args) {
        String a = "Wow";
        String b = a;
        String c = new String("Wow!");
        String d = c;

        boolean b1 = a == b;            // true because both refer to the same object
        boolean b2 = d.equals(b + "!"); // true because "Wow!" equals "Wow" + "!"
        boolean b3 = !c.equals(a);      // true because "Wow!" is not equal to "Wow"

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}
