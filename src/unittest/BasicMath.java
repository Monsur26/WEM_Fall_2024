package unittest;

import org.apache.log4j.Priority;
import org.junit.Assert;
import org.junit.Test;

public class BasicMath {
    public int sumOfNumbers(int a, int b){
        int sum = a+b;
        return sum;
    }
    public int subtractOfNumbers(int a, int b){
        int subs = a-b;
        return subs;
    }
    public int multiplyNumbers(int a, int b){
        int multiply = a*b;
        return multiply;
    }
    public int divisionOfNumbers(int a, int b){
        int divide = a/b;
        return divide;
    }
    @Test()
    public void testSum(){
        int sum = sumOfNumbers(1,2); //3
        Assert.assertEquals(3,sum);
    }
    @Test
    public void testSubs(){
        int subs = subtractOfNumbers(5,4);
        Assert.assertEquals(2,subs);
    }
}
