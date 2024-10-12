package javacontrolflow.practice;

public class Practice2 {
    //Write a java program that'll take 39, 45, 23 as number and find out the smallest number

    public static int smallestNumber(int a, int b, int c){
        if(a<b && a<c){
            System.out.println("the smallest number is :"+ a);
            return a;
        } else if (b<a && b<c){
            System.out.println("the smallest number is :"+b);
            return b;
        } else if (c<a && c<b) {
            System.out.println("the smallest number is :"+c);
            return c;
        } else {
            System.out.println("We dont have a concrete smallest number");
            return 0;
        }
    }

    public static void main(String[] args) {
        smallestNumber(39,45,23);
        smallestNumber(4,5,5);
    }

}
