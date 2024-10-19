package javaenum;

public class ValidateDay {
    public static void main(String[] args) {
        Days today = Days.Saturday;
        System.out.println("Today is: "+ today);

        if (today == Days.Saturday || today == Days.Sunday) {
            System.out.println("This is the weekend, we have a class");
        } else {
            System.out.println("No class today.");
        }
    }
}
