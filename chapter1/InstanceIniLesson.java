package chapter1;

public class InstanceIniLesson {
    public InstanceIniLesson(){
        code=999;
        System.out.println(code);
    }
    int code=0;
    {
        System.out.println(code);
    }

    public static void main(String[] args) {
        InstanceIniLesson ini = new InstanceIniLesson();
        { 
            System.out.println("Feathers");
        }
        {
            System.out.println("Manok");
        }
        System.out.println(ini.code);
    }
    {   
        System.out.println("Snowy");
        code = 100;
        System.out.println(code);
    }


}