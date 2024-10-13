package javacontrolflow.javaforloop;

public class Practice3 {
    //write a java program that will print all the alphabet from a-z
    public static void printAlphabets(char start, char end){
        char ch;
        for (ch = start;  ch<= end ; ch++) {
            System.out.print(ch +",");
        }
    }

    // write a java program that will count backwards from 3-1, when counter
    //becomes 1, it'll show the output "Happy New Year"
    public static void happyNewYear(){
        for (int i = 3; i >=1 ; i--) {
            System.out.println(i);

            if(i ==1){
                System.out.println("Happy New Year");
            }
        }
    }
    //Write a Java program to reverse the string "Hello" using for loop
    public static String reverseString(String text){
        int indexOfText = text.length() - 1;
        String reverseText = "";

        for (int i = indexOfText; i >=0 ; i--) {
            reverseText =reverseText+ text.charAt(i);
        }
        System.out.println("The reverse of the text is : "+ reverseText);
        return reverseText;
    }
    //Write a Java program to find out whether or not a text is
    //palindrome text
    //examples civic, madam, aya, 11,22

    public static void checkPalindrome(String text){
        String palindromeText = reverseString(text);
        if (palindromeText.equalsIgnoreCase(text)){
            System.out.println("The text is a palindrome text");
        } else {
            System.out.println("The text is not a palindrome text");
        }

/*        int indexOfText = text.length() - 1;
        String reverseText = "";

        for (int i = indexOfText; i >=0 ; i--) {
            reverseText =reverseText+ text.charAt(i);
        }
        System.out.println("The reverse of the text is : "+ reverseText);
        if(reverseText.equalsIgnoreCase(text)){
            System.out.println("The text is palindrome text");
        } else {
            System.out.println("the text is not palindrome text");
        }*/
    }

    public static void main(String[] args) {
        printAlphabets('A','Z');
        System.out.println("");
        happyNewYear();
        reverseString("Happy");
        checkPalindrome("Civic");
    }
}
