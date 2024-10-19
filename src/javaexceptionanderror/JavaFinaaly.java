package javaexceptionanderror;

public class JavaFinaaly {
    public static void main(String[] args) {
        try {
            int a=1; int b=0; int sum;
            sum= a/b;
            System.out.println(sum);

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("I ran the program");
        }
    }
}
