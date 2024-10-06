package javacontrolflow.javaifelse;

public class JavaIfElseSecond {
    public static void modOfNumbers(int a, int b){
        if(a%b>=1){
            System.out.println("The modulus of number :"+ a+" And number :"+ b+ " is : "+ a%b );
        } else {
            System.out.println("There is no Modulus available");
        }
    }

    public static void main(String[] args) {
        modOfNumbers(11,11);
    }
}
