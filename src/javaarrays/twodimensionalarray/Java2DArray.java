package javaarrays.twodimensionalarray;

import java.util.Arrays;

public class Java2DArray {
    public static void main(String[] args) {
        int[][] num = new int[2][2];
        num[0][0]= 1;
        num[0][1]= 2;
        num[1][0]= 3;
        num[1][1]= 4;
        System.out.println(Arrays.deepToString(num));

        int [][] num2 = new int[3][3];

        num2[0][0] =11;
        num2[0][1] =12;
        num2[0][2] =13;
        num2[1][0] =21;
        num2[1][1] =22;
        num2[1][2] =23;
        num2[2][0] =31;
        num2[2][1] =32;
        num2[2][2] =33;

        // Getting all the values of an array using for loop
        for (int i = 0; i <num2.length ; i++) {
            for (int j = 0; j <num2[i].length ; j++) {
                System.out.print(num2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("************ **************** ****************");
        //getiing all the values of an array using for each loop
        for (int[] n: num2){
            for (int s: n){
                System.out.print(s + " ");
            }
            System.out.println();
        }
        
        
        
        System.out.println(Arrays.deepToString(num2));

        String[][] str1 = {{"Monsur", "Faruk"},{"Boris","Rayhan"},{"Nadjla", "Fatema", "Wail"}};
        System.out.println(Arrays.deepToString(str1));
/*        str1[0][2]= "Jack";
        str1[1][2] = "Ali";
        System.out.println(Arrays.deepToString(str1));*/
        
    }
}
