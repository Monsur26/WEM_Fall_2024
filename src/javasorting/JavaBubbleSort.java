package javasorting;

import java.util.Arrays;

public class JavaBubbleSort {
    public static void main(String[] args) {
        int [] arr = {21,43,2,34,11,23};
        int temp = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr.length-i-1 ; j++) {
                if (arr[j] > arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
