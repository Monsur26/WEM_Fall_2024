package javaexceptionanderror;

public class JavaError {
    public static void main(String[] args) {
       // this is a compile time error because its missing ;
        // System.out.println()

        //Runtime error only shows up after we run the program
        int a=10;
        int b =1;

        try{
            System.out.println(b/a);
        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException);
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Hello");

    }
}
