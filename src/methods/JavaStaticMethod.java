package methods;

public class JavaStaticMethod {
    static int a =9;
    int b=5;

    public static void sumOFNumbers(){
        int c = 10;
        JavaStaticMethod jb1= new JavaStaticMethod();
        int d = jb1.b;
        int sum= a+d+c;
        System.out.println("The aggregate of the numbers is :"+sum);
    }

    public static void subtractionOfTwoNumbers(){
        int num1 = 10;
        int num2 = 5;
        int sub =num1-num2;
        System.out.println("The difference of two numbers is: "+ sub);
    }

    public static void main(String[] args) {
        sumOFNumbers();
        subtractionOfTwoNumbers();
    }
}
