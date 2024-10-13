package javacontrolflow.javadowhileloop;

public class JavaDoWhileLoop {
    public static  void reverseCount(){
        int n=10;
        do{
            System.out.println(n);
            n--;
        } while (n>=0);
    }
    public static void main(String[] args) {
        int i=1;
        do {
            System.out.println(i);
            i++;
        }while(i<=10);
        reverseCount();
    }

}
