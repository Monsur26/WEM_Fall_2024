package javacontrolflow.javaforloop;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Practice2 prac = new Practice2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = sc.nextInt();
        prac.sumOfNthNumber(number);
        prac.printEvenNumber(number);
        prac.printOddNumber(number);

    }
}
