package lecture;

public class Operator {
    public static void main(String[] args) {
        int a= 5;
        int b=9;
        int c=3;
        //Variables is a public class, so reference can be made anywhere within the same package or outside the package
        Variables vr1 = new Variables();

        //DefaultAccess is a default class, so reference can be made anywhere within the same package
        DefaultAccess defaultAccess = new DefaultAccess();

        //arithmetic operators: Operators that's used for mathematical calculations

        //Addition
        System.out.println(a+b); //adding numbers directly through output statement - not ideal
        int sum = a+b;
        System.out.println("This is the sum of two numbers: "+sum); //calling variable that stored addition of numbers

        //Subtraction
        int subtraction= b-c;
        System.out.println("This is the subtraction of two numbers:"+ subtraction); // calling variable that stored subtraction of numbers

        //Multiplication
        int multiply=a*c;
        System.out.println("This is the multiplication of two numbers: "+multiply); //Calling variable that stored multiplication value of numbers

        //Division
        int division= b/c;
        System.out.println("This is the division of two numbers: "+division); // Calling the variable that stored the division of two numbers

        // modulus
        int mod=a%c;
        System.out.println("This is the mod of two numbers: "+mod); //Calling the variable that stored the mod of two numbers

        //Assignment operator
        int y =6;
        y++;
        y--;
        System.out.println(y);
        y++; //7
        y--; //6
        y--; //5
        y--; //4
        y++;//5
        y++; //6
        y--; //5
        System.out.println(y);
        --y;//4
        ++y;//5
        y+=2;//7
        y-=3;//4
        y+=4;//8
        y-=10;//-2
        y+=23;//21
        System.out.println(y);
        y*=3;//63
        y%=10;//3




    }
}
