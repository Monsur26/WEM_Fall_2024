package javacontrolflow.switchcase;

public class Practice {
    public static void dayNumber(String dayName){
        switch (dayName){
            case "Monday":
                System.out.println("Today is day number 1");
                break;
            case "Tuesday":
                System.out.println("Today is day number 2");
                break;
            case "Wednesday":
                System.out.println("Today is day number 3");
                break;
            case "Thursday":
                System.out.println("Today is day number 4");
                break;
            case "Friday":
                System.out.println("Today is day number 5");
                break;
            case "Saturday":
                System.out.println("Today is day number 6");
                break;
            case "Sunday":
                System.out.println("Today is day number 7");
                break;
            default:
                System.out.println("Incorrect dayName");
                break;
        }
    }

    public static void main(String[] args) {
        dayNumber("Monday");
    }
}
