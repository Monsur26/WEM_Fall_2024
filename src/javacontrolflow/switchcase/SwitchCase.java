package javacontrolflow.switchcase;

public class SwitchCase {
    /**
     * User must select a number from 1 -12 to find out an appropriate month
     * @param month
     */
    public static void monthSelection(int month){

        switch (month){
            case 1:
                System.out.println(" This is January");
                break;
            case 2:
                System.out.println(" This is February");
                break;
            case 3:
                System.out.println(" This is March");
                break;
            case 4:
                System.out.println(" This is April");
                break;
            case 5:
                System.out.println(" This is May");
                break;
            case 6:
                System.out.println(" This is June");
                break;
            case 7:
                System.out.println(" This is July");
                break;
            case 8:
                System.out.println(" This is August");
                break;
            case 9:
                System.out.println(" This is September");
                break;
            case 10:
                System.out.println(" This is October");
                break;
            case 11:
                System.out.println(" This is November");
                break;
            case 12:
                System.out.println(" This is December");
                break;
            default :
                System.out.println(" Incorrect Month Selection");
                break;
        }

    }
    public static void main(String[] args) {
       monthSelection(4);
    }
}
