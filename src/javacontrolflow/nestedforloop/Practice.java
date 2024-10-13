package javacontrolflow.nestedforloop;

public class Practice {
    public void weeksAndDays(){
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=7 ; j++) {
                if (j==1){
                    System.out.println("Week "+ i + " Day number " + j +" Day :Monday");
                } else if (j ==2){
                    System.out.println("Week "+ i + " Day number " + j + " Day :Tuesday");
                } else if (j ==3){
                    System.out.println("Week "+ i + " Day number " + j + " Day :Wednesday");
                }else if (j ==4){
                    System.out.println("Week "+ i + " Day number " + j + " Day :Thursday");
                }else if (j ==5){
                    System.out.println("Week "+ i + " Day number " + j + " Day :Friday");
                }else if (j ==6){
                    System.out.println("Week "+ i + " Day number " + j + " Day :Saturday");
                }else if (j ==7){
                    System.out.println("Week "+ i + " Day number " + j + " Day :Sunday");
                }
            }
        }

    }
    public void multiplicationTable(){
        for (int i = 1; i <=10 ; i++) {
            System.out.println("Multiplication table when i ="+i);
            for (int j = 1; j <=10 ; j++) {
                System.out.print(i*j + " , ");
            }
            System.out.println("");
        }
    }
    public void numberSeries(){
        for (int i = 1; i <=3 ; i++) {
            for (int j = 3; j >=1 ; j--) {
                System.out.println( "When i is :"+ i+ " j is "+ j);
            }
        }
    }
    public void rightTriangle(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void flipRightTriangle(int n){
        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
