package chapter1;

public class ObjectsLifeLesson {
    
    public static void main(String[] args) {
        House h1 = new House();
        House h2 = new House();
        House h3 = h1;
        h3.block =1;
        h3.lot = 1;
        h1.family ="De Guzman's";
        h1 = null;
        h1=h3;
        h1=null;
        h3=null;
        h1 = new House();
        System.out.println(h3);

    }

}

class House{
    int block;
    int lot;
    String family;
    void objectMethodSample(){
        House newHouse = new House();
    }
}
