import java.util.Scanner;

public class Practice {

    private static final Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Week 4 - LAB 2 Practice");
        // Variable decleration
        String studentName;
        int yearBorn;
        int age;

        // get input data
        System.out.println("Enter your name: ");
        studentName = keyboard.nextLine();

        System.out.println("What year were you born? ");
        yearBorn = keyboard.nextInt();

        // Processing data
        age = 2025 - yearBorn;

        // output results
        System.out.println("Hello " + studentName + ". You are " + age + " years old.");


      /*  double result = 12.45;

        System.out.println("The integer part " + (int) result);

        System.out.println("The decimal part: " + (int)Math.ceil(result % 1));*/
    } // end of the main method


} // end of the Practice class
