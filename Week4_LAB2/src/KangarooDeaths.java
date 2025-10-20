import java.util.Scanner;
public class KangarooDeaths {

    // constant variables
    private static final Scanner keyboard = new Scanner(System.in);
    private static final double roadkillCon = 1.47;
    private static final double widthRoads = (10.0 / 1000);

    // Equation to calculate how many roos die
    public static void roadkillCalc(double a, double b, int c){

        // Perform computations
        double squareAreaKm = a * a;
        double density = c / squareAreaKm;
        double roadSa = b * widthRoads;
        double rooAnswer =  roadSa * density * roadkillCon;


        // Display answer
        System.out.println("Expected number of kills is : " + (int)rooAnswer);
        System.out.println("Expected number of injuries : " + (int)Math.ceil(rooAnswer % 1));


    } // end of roadkillCalc method
    public static void main(String[] args) {

        System.out.println("Week 4 - LAB 2");

       // Variable Declaration
        double squareKm;
        double roadKm;
        int roo;

        // Get data
        System.out.println("Enter side of square in km  : ");
        squareKm = keyboard.nextDouble();

        System.out.println("Enter roads length in km : ");
        roadKm = keyboard.nextDouble();

        System.out.println("Enter number of 'roos : ");
        roo = keyboard.nextInt();

        // Calculation call
        roadkillCalc(squareKm, roadKm, roo);





    } // end of the main method

} // end of the KangarooDeaths class
