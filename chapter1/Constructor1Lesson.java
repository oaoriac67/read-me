package chapter1;

public class Constructor1Lesson {
    public static void main(String[] args) {
        Chick chick1 = new Chick();
        Chick chick2 = new Chick();
        Chicken andoks = new Chicken();
        chick1.Chick();
        System.out.println(chick1.getNumber());
    }

}

class Chick{
    String number;
    public Chick(){ 
        System.out.println("🐣 Im am a constructor - new Chick Object");
    }
    void Chick(){
        System.out.println("🐤💬");
    }
    String getNumber(){
        return number;
    }
}

class Chicken{
    int numEggs = 0;
    String name;
    public Chicken(){
        name = "Duke";
    }
}

class Swan{
    int numEggs;
    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numEggs = 4;
        System.out.println(mother.numEggs);

    }
}
class Name{
    String first = "Marc";
    String last = "Yim";
    String full = first+last;
    public static void main(String[] args) {
        Name name1 = new Name();
        System.out.println(name1.full);
        name1.first = "Linda";
        name1.last = "Walker";
        System.out.println(name1.full);
        Name name2 = new Name();
        name2.full = name1.first+name1.last;
        System.out.println(name2.full);
    }
}