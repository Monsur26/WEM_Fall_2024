package javacontrolflow.javaifelse;

public class JavaIfElse {
    public static void main(String[] args) {
        int a = 9;
        int b= 10;

        int sum = a+b;
        int subs= a-b;

        boolean isMarried = true;
        if (sum != 19){
            System.out.println("Sum is different value");
        } else {
            System.out.println("Sum is 19");
        }

        if ((sum == 190) || (subs ==2)){
            System.out.println("Calculation reflects the condition");
        } else {
            System.out.println("Calculation do not reflects the condition");
        }

        if(isMarried){
            System.out.println("The Person is married");
        } else {
            System.out.println("The Person is not married");
        }
    }
}
