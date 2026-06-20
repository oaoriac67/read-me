package ChapterTasks;

interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

public class Gorilla implements Animal {

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Grooming the gorilla...");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("Petting the gorilla... cautiously!");
    }

    @Override
    public boolean feed(boolean timeToEat) {
        // put gorilla food into cage
        if (timeToEat) {
            System.out.println("Feeding the gorilla...");
            return true;
        } else {
            System.out.println("Not feeding time yet.");
            return false;
        }
    }

    public static void main(String[] args) {
        Gorilla g = new Gorilla();
        g.groom();
        g.pet();
        g.feed(true);
    }
}


