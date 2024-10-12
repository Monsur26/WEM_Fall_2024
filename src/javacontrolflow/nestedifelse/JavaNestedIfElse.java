package javacontrolflow.nestedifelse;

import java.util.Scanner;

public class JavaNestedIfElse {
    /*
    Nested if else is conditions inside another condition.
     */
    public static int evenOrOdd(int num){
        if (num >0){
            System.out.println("This is a positive number");
            if (num % 2 == 0){
                System.out.println("And  the number is an even number ");
            } else {
                System.out.println(" And the number is an odd number");
            }
        } else if (num <0){
            System.out.println("This is a negative number");
        } else {
            System.out.println("The number is 0");
        }
        return num;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a valid whole number");
        int userInput = scanner.nextInt();

        evenOrOdd(userInput);
    }
}
