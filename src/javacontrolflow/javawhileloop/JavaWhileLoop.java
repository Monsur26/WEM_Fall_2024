package javacontrolflow.javawhileloop;

public class JavaWhileLoop {
    public static void reverseNumber(int num){
        while(num >=0){
            System.out.println(num);
            num--;
        }
    }

    public static void main(String[] args) {
        int num2=1;
        while (num2 <=10){
            System.out.println(num2);
            num2++;
        }
        reverseNumber(55);

    }
}
