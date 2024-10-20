package javaarrays.onedimensionalarray;

import java.util.Arrays;

public class Java1DaArrayPractice {
    public static void main(String[] args) {
        // Defining an array name and putting each element values with a {}, values are separated by ,
        String [] str1 = {"Boris", "Faruk", "Rayhan"};

        // defining the length first and then insert array value through each index
        String [] str2 = new String[3];
        str2[0] = "Monsur";
        str2[1] = "Zunair";
        str2[2] = "Nadjla";
        System.out.print("[");
        //The elements are stored in a single row and can be accessed by a single index. we are using for loop to
        //access each index and print corresponding value
        for (int i = 0; i <str2.length ; i++) {
            System.out.print(str2[i]+ ", ");
        }
        System.out.print("\b\b]\n");
        /*A for-each loop is a type of loop in Java that allows you to iterate over
        the elements of an array or a collection without using an index.
         The for-each loop makes it easier to process the elements of an
         array because you don't need to keep track of the current index.*/
        for(String s : str1){
            System.out.println(s);
        }



        // Arrays.toString(variableName) will print out all of the elements of an array variable, same as for and foreach loop
        System.out.println("\n"+Arrays.toString(str2));
        //printing specific index value from an array
        System.out.println(str2[2]);
        // Length defines in while number how many elements we have within an array
        System.out.println(str2.length);

        //Creating a copy of an existing array using Arrays.copyOF()
        String[] str3 = Arrays.copyOf(str2,10);
        String[] str4 = Arrays.copyOf(str1,str1.length);

        System.out.println("The values of str3 is :"+ Arrays.toString(str3));
        str3[4] ="Hi";
        System.out.println(Arrays.toString(str3));

        // Arrays.Fill all the elements with the same value
        String[] str5 = {"hujavjdv","jvjd","jgvdja"};
        System.out.println(Arrays.toString(str5));
        Arrays.fill(str5,"Chicken");
        System.out.println(Arrays.toString(str5));

        // Arrays.equals function will compare two arrays
        System.out.println(Arrays.equals(str1,str2));

        //Arrays.sort will sort the elements in ascending order
        int[] num2 = {10,5,6,4,32,7,4,1};
        Arrays.sort(num2);
        System.out.println(Arrays.toString(num2));
    }
}
