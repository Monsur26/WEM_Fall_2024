package javaarrays.onedimensionalarray;

import java.util.Arrays;

public class Practice {
    public static void maxAndMinValueOfArray(int [] arr){
        Arrays.sort(arr);
        System.out.println("Minimum value of the arrays is :" + arr[0]);
        System.out.println("Maximum value of the arrays is :" + arr[arr.length-1]);
    }
    public static void sumOfAllTheNumbersOfAnArray(int [] arr){
        int sum =0;
        for (int i = 0; i <arr.length ; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Total value of all the element combined is :"+ sum);
    }
    public static void reverseArray(int [] arr){
        System.out.print("[");
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("\b\b]");
    }


    public static void main(String[] args) {
        int[] num = {54,243,434,1,3234,123,12,54,23,76,86,663,8763};
        maxAndMinValueOfArray(num);
        int [] num2 = {1,2,3};
        sumOfAllTheNumbersOfAnArray(num2);
        reverseArray(num2);
    }
}
