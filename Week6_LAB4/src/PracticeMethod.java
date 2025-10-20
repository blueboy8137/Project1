import java.util.Scanner;
public class PracticeMethod {

    public static void main(String[] args) {

        System.out.println("Week 6 Lab 4 Practice ");
       // showStudentInfo("Michael Coluccio", "Computer Science");
        double answer = calculateSum(10, 20.5);
        System.out.println("Sum is " + answer);

    }// end of the main method

    public static void showStudentInfo(){
        System.out.println("Student Name: Michael Coluccio");
        System.out.println("Major: Computer Science");

    } // end of the showStudentInfo method

    public static void showStudentInfo(String name, String major){
        System.out.println("Student Name: " + name);
        System.out.println("Major: " + major);

    } // end of the showStudentInfo with 2 parameters method

    public static double calculateSum(double firstNum, double secondNum){

        double result;

        result = firstNum + secondNum;

        return result;
    } // end of the calculateSum method

}// end of the PracticeMethod class
