package javacontrolflow.javadowhileloop;

public class Practice {
    public void sumOfNthNumber(int start, int end) {
        int num = start;
        int sum = 0;
        do {
            sum += num;
            num++;
        } while (num <= end);
        System.out.println("The sum of numbers from " + start + " till " + end + " is " + sum);
    }

    public void factorialOfNthNumber(long start, long end) {
        long factorial = 1;
        long increment = start;
        do {
            factorial *= start; // factorial = factorial * num;
            increment++;
        } while (increment <= end);
        System.out.println("the factorial of number "+ start + " till "+ end+ " is "+ factorial);
    }
}
