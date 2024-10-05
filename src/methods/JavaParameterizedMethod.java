package methods;

public class JavaParameterizedMethod {
/*
Parameters are defined within the parenthesis after the method name. When the method is question is invoked then you can
give  value(s) for the parameters. This is a way of making code more dynamic and robust.
 */
    public static int sumOfTwoNumber(int a, int b){
        return a+b;
    }

    public static int sumOfThreeNumber(int a, int b){
        int c= 90;
        return a+b+c;
    }
    public static String studentName(String name){
        return name;
    }

    /**
     * This is a method that is going to define a mailing address for a specific person in the form of a letter head
     * @param name
     * @param address
     * @param cellNo
     * @return the value combinaing the parameters
     */
    public static String mailingAddress(String name,String address, long cellNo){
        return "Name : "+ name+ "\nAddress: " +address+"\nCell No: "+ cellNo;

    }

    public static void main(String[] args) {
        System.out.println(sumOfTwoNumber(10,6));
        System.out.println(sumOfTwoNumber(12,30));
        System.out.println(sumOfThreeNumber(23,45));
        System.out.println(studentName("Monsur"));
        System.out.println(studentName("Boris"));

        System.out.println(mailingAddress("Monsur","123 Street, NY",917402));

    }
}
