package javastring;

public class JavaString {
    public static void main(String[] args) {
        //Creating String object
        String name  = "Monsur";
        //Creating String object using constructor
        String secondName = new String("Rayhan");
        //Converting another datatype in to string value
        int a= 5;
        String newA= String.valueOf(a);

        System.out.println(name +" , " + secondName);

        String firstName = "Monsur";
        String lastName = "Ahmed";
        // Concatenation to append two or more  string values to create new value
        String fullName = firstName + " "+ lastName;
        int age = 18;
        String fullNameAndAge = firstName + " "+ lastName+ "Age is :"+ age;
        System.out.println(fullName);
        System.out.println(fullNameAndAge);

        // Finding out number of characters in a String object
        int lengthOfFullName= fullName.length();
        System.out.println("Length of the string : "+ lengthOfFullName);

        // Finding out index of a character , Complete index of any String is length() -1.
        int indexOfUllName = fullName.length() -1;
        System.out.println("Index of the string : "+ indexOfUllName);
        char characterAtIndexNine = fullName.charAt(9);
        System.out.println("The Character at index number 9 is :"+ characterAtIndexNine);

        //Substring- making a new string from certain character indices of an existing string
        String helloWorld = "Hello, World!";
        int indexofHelloWorld = helloWorld.length() -1;
        System.out.println( "the index number is : "+ indexofHelloWorld);

        //substring
        String newStringfromHelloWorld = helloWorld.substring(7,12);
        String newStringfromHelloWorld2 = helloWorld.substring(7);
        System.out.println("The substring value is : "+ newStringfromHelloWorld);
        System.out.println("The substring value is : "+ newStringfromHelloWorld2);

        // indexOf gices you specific index where the String occurs for the first time
        String s1 = "there, There - don't worry";
        int indexofs1There = s1.indexOf("There");
        System.out.println(indexofs1There);

        // Uppercaea and lowercase - makes
        String lowerCaseName = "monsur ahmed";
        String upperCaseName = "FARUK AHMED ";

        System.out.println(lowerCaseName.toUpperCase());
        System.out.println(upperCaseName.toLowerCase());

        //replace()- creating a new instance by changing char from one character to new character
        String s2 = "Nice House";
        String s3 =s2.replace('N','R');
        System.out.println(s3);

        // trim() will get rid of preceeding and trailing spaces
        String tree= "                               tree house                          ";
        System.out.println(tree);
        System.out.println(tree.trim());

        // String Builder

        StringBuilder sb = new StringBuilder("Monsur");
        System.out.println(sb);

        // append() - this will add value to an existing value
        sb.append(" Ahmed");
        System.out.println(sb);

        // insert() adds a value at a specifed palce
        StringBuilder sb2 = new StringBuilder("Hello Nice");
        sb2.insert(5, " World");
        System.out.println(sb2); // "Hello World"

        // delete - specifying indices to delete a portion of value
        StringBuilder sb4 = new StringBuilder("This is a nice class");
        sb4.delete(10,14); //delete the word "nice"
        System.out.println(sb4);
        // replace
        StringBuilder sb5 = new StringBuilder("This is a good class");
        sb5.replace(10,14,"dull");
        System.out.println(sb5);

        StringBuffer sf1 = new StringBuffer("This is a String Buffer");
        System.out.println(sf1);
        // reverse() puts the value in reverse sequence
        System.out.println(sf1.reverse());

        // ToString()- converting to a string object from Stringbuilder ot Buffer
        StringBuffer sf2 = new StringBuffer("Good");
        String ssff = sf2.toString();
        System.out.println(ssff);



    }
}
