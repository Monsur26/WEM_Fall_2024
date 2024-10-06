package javacontrolflow.javaifelseif;

public class JavaifElseIf {
    public static void main(String[] args) {
        int a =5;
        int b =9;
        char sign = '1';

        if (sign == '+'){
            System.out.println(a+b);
        } else if (sign == '-'){
            System.out.println(a-b);
        } else if (sign == '*'){
            System.out.println(a*b);
        } else if (sign == '/'){
            System.out.println(a/b);
        } else {
            System.out.println("Operator is not correct, please choose either '+','-','*' or '/'");
        }
    }
}
