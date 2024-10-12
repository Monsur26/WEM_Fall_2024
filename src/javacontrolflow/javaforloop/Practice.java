package javacontrolflow.javaforloop;

public class Practice {
    public static void loopExample(String num) {
        if (num.equals("positive")) {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Positive number loop count" + i);
            }
        } else if (num.equalsIgnoreCase("Negative")) {

                for (int i = 10; i >= 0; i--) {
                    System.out.println("Negative number loop count" + i);
            }
        } else {
            System.out.println("invalid number");
        }
    }

    public static void main(String[] args) {
        loopExample("POSITIVE");
    }
}
