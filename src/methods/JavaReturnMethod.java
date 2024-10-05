package methods;

public class JavaReturnMethod {
    int a= 10;
    int b= 20;

    public int sumOfTwoNumbers(){
        int sum = a+b;
        return sum;
    }
    // at th end of execution the value is whatever value I return. In this case the value = value of Sum which is 30.
    // Since a is 10 and b is 20, a+b = 10+20=30. So the value of sum is 30. Since return is sum, the value of method sumOfTwoNumbers is also 30.
    public static String nameOfCity(){
        String name = "Monsur";
        return name;
    }
    public String StudentName(){
        String studentName= "Somaia";
        return studentName;
    }

    public static void main(String[] args) {
        JavaReturnMethod jr1 = new JavaReturnMethod();
        int c =jr1.sumOfTwoNumbers();
        System.out.println(c);
        System.out.println(nameOfCity());
        System.out.println(jr1.StudentName());

    }
}
