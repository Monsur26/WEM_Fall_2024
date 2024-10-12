package javacontrolflow.javaforloop;

public class Practice2 {
    public int sumOfNthNumber(int n){
        int sum=0;
        for (int i = 0; i <=n ; i++) {
            sum = sum +i;
        }
        System.out.println("The sum of the number is :"+ sum);
        return sum;
    }
    public void printEvenNumber(int n){
        for (int i = 0; i <=n ; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }
    }
    public void printOddNumber(int n){
        for (int i = 0; i <=n ; i++) {
            if (i%2 != 0) {
                System.out.println(i);
            }
        }
    }


}
