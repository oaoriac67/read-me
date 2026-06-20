package chapter2;

public class IfSwitchStatementLesson {
    static boolean isNight(){
        return false;
    }
    public static void main(String[] args) {
        int hourOfDay = 19;
        boolean isMorning= true;
        int morningGreetingCount = 0;
        if(hourOfDay<11){// true, isMorning, isNight()
            System.out.println("Good Morning");
            System.out.println("Kumain kana ba?1");
            }

        //if-else
        if(hourOfDay<11)
            System.out.println("Good Morning");
        else
            System.out.println("Good Afternoon");
        System.out.println("Kumain kana ba?2");
        

        if(hourOfDay<11)
            System.out.println("Good Morning");
        else if(hourOfDay<18)
            System.out.println("Good Afternoon");
        else if(hourOfDay<22){
            System.out.println("Good Evening");
            System.out.println("Gising kapa?");
        }
        else
            System.out.println("so late at night");

        
        int dayOfWeek =6;
        switch(dayOfWeek){
             default:
                System.out.println("invalid day of week");
                break;
            case 1:
                System.out.println("monday");
            case 2:
                System.out.println("tuesday");
           
            case 3:
                System.out.println("wednesday");
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
        }
        // float pi = 3;
        //2nd switch
        switch(dayOfWeek){
            // case Araw.Fri.getValue(): 
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekdays");
                break;
            case 6:
            case 7:
                System.out.println("weekends");
                break;
            default:
                System.out.println("invalid day of week");
                break;
        }
        System.out.println("end of program");    
    }   
}
enum Araw{
    Mon(1),Tues(2),Wed(3),Thur(4),Fri(5),Sat(6),Sun(7);
    final int value;
    private Araw(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}