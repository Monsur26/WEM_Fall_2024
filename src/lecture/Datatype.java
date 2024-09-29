package lecture;

public class Datatype {
    int a = 67;
    public static void main(String[]args){
        // whole numbers
        byte firstByte = 127;   // this is byte datatype

        short myShort = 32700; //this is short datatype
        short myNegativeShort = -10000; // this is a negative short datatype

        int firstInteger = 6500; //this is integer datatype
        int firstNegativeInteger = -4000; // this is a negative interger

        long firstLong = 6776465; //this is a long datatype
        long negativeLong = -9876865; //this is a negative long datatype

        // Decimal Numbers

        // this is a float datatype
        float firtsFloat= 87.950f; // float datatype will need an 'f' at the end of the value
        // Double datatype
        double firstDouble = 56.98765456;

        //Characters
        char firstChar = 'A';

        //Boolean
        boolean firstTrue = true;
        boolean firstFalse = false;


        System.out.println(firstByte);
        System.out.println(firstDouble);

        System.out.println(firstByte + " , "+firstInteger ); //concat in Java
        System.out.println("This is the value of a negative short: " +myNegativeShort);


        //Non primitive datatype - STRING
        String myString= "Our Class is very nice";

        System.out.println(myString+" But the teacher is mehh");

    }
}
