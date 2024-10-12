package javacontrolflow.javaifelseif;

public class Practice3 {
    public static int sumOfThreeNumbers(int num1, int num2,int num3, char operator1, char operator2){
        int result=0;

        if (operator1 == '+' && operator2 == '+'){
            result = (num1 + num2) + num3;
        } else if (operator1 == '+' && operator2 == '-'){
            result = (num1 + num2) - num3;
        }else if (operator1 == '+' && operator2 == '*'){
            result = (num1 + num2) * num3;
        } else if (operator1 == '+' && operator2 == '/'){
            result = (num1 + num2) / num3;
        } else if (operator1 == '-' && operator2 == '+'){
            result = (num1 - num2) + num3;
        }else if (operator1 == '-' && operator2 == '-'){
            result = (num1 - num2) - num3;
        }else if (operator1 == '-' && operator2 == '*'){
            result = (num1 - num2) * num3;
        }else if (operator1 == '-' && operator2 == '/'){
            result = (num1 - num2) / num3;
        }else if (operator1 == '*' && operator2 == '+'){
            result = (num1 * num2) + num3;
        }else if (operator1 == '*' && operator2 == '-'){
            result = (num1 * num2) - num3;
        }else if (operator1 == '*' && operator2 == '*'){
            result = (num1 * num2) * num3;
        }else if (operator1 == '*' && operator2 == '/'){
            result = (num1 * num2) / num3;
        }else if (operator1 == '/' && operator2 == '+'){
            result = (num1 / num2) + num3;
        }else if (operator1 == '/' && operator2 == '-'){
            result = (num1 / num2) - num3;
        }else if (operator1 == '/' && operator2 == '*'){
            result = (num1 / num2) * num3;
        }else if (operator1 == '/' && operator2 == '/'){
            result = (num1 / num2) / num3;
        } else {
            System.out.println("The operator(s) is/are not correct");
        }
        System.out.println("The result of the operation is :"+ result);
        return  result;
    }

    public static void main(String[] args) {
        sumOfThreeNumbers(2,2,2,'-','+');
    }
}
