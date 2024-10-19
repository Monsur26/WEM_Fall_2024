package javaexceptionanderror;

public class ExceptionHandling {
    public static int division(int a, int b){
       int sum = 0;
        try {
             sum = a/b;
            System.out.println(sum);
        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException);
        }
        return sum;
    }
    public static void validateData(int data) throws IllegalArgumentException {
        if (data < 0) {
            throw new IllegalArgumentException("Data must be positive");
        }
    }


    public static void main(String[] args) throws Exception {

      //  validateData(-1);
       // division(10,10);
        System.out.println(1+2);
        System.out.println("1"+ "2");
    }
}
