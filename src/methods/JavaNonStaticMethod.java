package methods;

public class JavaNonStaticMethod {
    int num1=35;
    static int num2=21;
     int num3=21;
    static int num4=21;
     int num5=21;
    static int num6=21;

    public void sumOFNumbers(){
        int num3=45;
        int sum= num1+num2+num3;
        System.out.println("The aggregate of numbers is: "+ sum);
    }

    public void multiplyNumbers(){
        int num3=23;
        int multiply= num1*num2*num3;
        System.out.println("The number after multiplication is : "+ multiply);
    }

    public static void main(String[] args) {
        JavaNonStaticMethod obj1 = new JavaNonStaticMethod();
        obj1.multiplyNumbers();
        obj1.sumOFNumbers();
    }
}
