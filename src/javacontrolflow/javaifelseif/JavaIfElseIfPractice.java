package javacontrolflow.javaifelseif;

import java.util.Scanner;

public class JavaIfElseIfPractice {
    public void calculator(double a, char sign, double b){
        if (sign == '+'){
            System.out.println(a+b);
        } else if (sign == '-'){
            System.out.println(a-b);
        } else if (sign == '*'){
            System.out.println(a*b);
        } else if (sign == '/'){
            System.out.println(a/b);
        } else {
            System.out.println("Operator is not correct, please choose either '+','-','*' or '/'");
        }
    }

    public void studentGradeSheet(String studentName, int studentID, int score){
        String grade= "";
        if(score>=60 && score<70){
            grade ="C";
            System.out.println("Student Name :"+ studentName + "\nStudentID :"+studentID+ "\nGrade :"+grade);
        } else if(score>=70 && score<80){
            grade ="B";
            System.out.println("Student Name :"+ studentName + "\nStudentID :"+studentID+ "\nGrade :"+grade);
        }else if(score>=80 && score<90){
            grade ="A";
            System.out.println("Student Name :"+ studentName + "\nStudentID :"+studentID+ "\nGrade :"+grade);
        }else if(score>=90 && score<=100){
            grade ="A+";
            System.out.println("Student Name :"+ studentName + "\nStudentID :"+studentID+ "\nGrade :"+grade);
        }else if(score<60 && score>=0){
            grade ="F";
            System.out.println("Student Name :"+ studentName + "\nStudentID :"+studentID+ "\nGrade :"+grade);
        } else {
            System.out.println("The information provided is not valid, please provide valid information ");
        }
    }

    public static void main(String[] args) {
        JavaIfElseIfPractice ob1 = new JavaIfElseIfPractice();

/*        ob1.calculator(5.5, '+', 7.9);
        ob1.calculator(5.5, '*', 7.9);
        ob1.calculator(5.5, '%', 7.9);*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student name");
        String stdName = scanner.nextLine();

        System.out.println("Please provide student ID");
        int stdID= scanner.nextInt();

        System.out.println("Please enter a valid score");
        int stdScore = scanner.nextInt();

        ob1.studentGradeSheet(stdName,stdID,stdScore);
    }
}
