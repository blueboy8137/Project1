import java.util.Scanner;

public class Practice {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args){

    System.out.println("Hello World");
    //Declare 3 variables
        int age;
        String studentName;
        double gpa;

        System.out.println("What is your name? ");
        studentName = keyboard.nextLine();

        System.out.println("What is your age? ");
        age = keyboard.nextInt();

        System.out.println("What is your gpa? ");
        gpa = keyboard.nextDouble();

        //output
        System.out.println(studentName + " is " + age + " years old and has a " + gpa + " gpa.");
        System.out.println("Have a geat day!");

    }// end of main




} //end of Practice
