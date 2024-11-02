package javacontrolflow.recurssion;

public class JavaRecurssion {
    public static void countWithRecurssion(int count) {
        System.out.println(count);
        count++;

        if (count <= 10) {
            countWithRecurssion(count);
        }
    }


    public static void main(String[] args) {
        countWithRecurssion(0);
    }
}