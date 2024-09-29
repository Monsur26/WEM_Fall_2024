package lecture;

public class Variables {

    //Global Variable - scope is anywhere in the class
    static int a = 8;
    int b= 5;
    int e =7;

    int f=b;


    public static void main(String[] args) {
        //Local Variable - scope is within the block of code where they're created
        int c=4;
        int d=2;

        // Assigning variable values to one another
        c=d;
        System.out.println("value check d: "+ d);
        System.out.println("value check c: "+ c);
        // syntax for object creation
        //ClassName objectName = new ClassName();
        Variables obj1 = new Variables();

        System.out.println(a);
        System.out.println(obj1.b);
        System.out.println(obj1.e);
    }
}
