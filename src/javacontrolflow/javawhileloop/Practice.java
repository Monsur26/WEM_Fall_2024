package javacontrolflow.javawhileloop;

public class Practice {
    //Create a while loop to
    // count number from 11-20
    //and print out only the even numbers
    public void printEvenNumberAscendingOrder(int start, int end){
        int num = start;
        while (num <=end){
            if(num%2 == 0){
                System.out.println(num);
            }
            num++;
        }

    }
    // Create a while loop to
    //add numbers from 0-20.
    public int sumOfNthNumber(int start, int end){
        int num = start;
        int sum =0;
        while(num <= end){
            sum +=num; //sum =sum + num;
            num++;
        }
        System.out.println("the sum of the numbers from "+ start+ " to "+ end+ " is :"+sum);
        return sum;
    }

    // printing alphabets chronologically avoiding vowels

    public void printAlphabets(char start, char end){
        char n= start;
        while(n<=end){
            if (n == 'a'|| n == 'e' || n == 'i'|| n == 'o' || n== 'u'){
                System.out.print("");
            } else {
                System.out.print( n+ " " );
            }
            n++;
        }
    }

    public long factorial(long start, long end){
        long factorial = 1;
        long num =start;
        while (num <=end){
            factorial = factorial*num;
            num++;
        }
        System.out.println("the factorial of numbers from "+start+ " till " + end + " is "+factorial);
        return factorial;
    }
}
