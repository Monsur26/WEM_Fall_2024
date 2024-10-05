package practice;

public class PracticeClass1 {
    int a = 5;
    static int b =9;
    public static void main(String[] args) {
        String name = "Monsur";
        int age = 18;

        PracticeClass1 pr1=new PracticeClass1();


        System.out.println(name);
        System.out.println(age);
        System.out.println("My name is "+ name);
        System.out.println("My age is "+ age);
        System.out.println("My age is "+ name + " My age is "+ age+ "Two variables are "+pr1.a+ ","+ b);
    }
}
