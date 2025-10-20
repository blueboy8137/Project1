import java.util.Scanner;


public class ScubaNitrox {
    //constant
    private static final Scanner keyboard = new Scanner(System.in);
    private static final int FEET_PER_ATM = 33;
    private static final double MAX_02_Pressure = 1.4;
    private static final double CONTINGENCY_O2_PRESSURE = 1.6;

    public static void CalcAmbientPress(int a, int b){


        //Calculations
        double ambientPress = (double)a / FEET_PER_ATM + 1;
        double PP02 = ((double)b/100) * ambientPress;
        char o2Group =( (char) ( (int)(PP02 * 10) + ((int)'A') -1));

        System.out.println("Ambient Pressure : " + ambientPress);
        System.out.println("O2 pressure : " + PP02);
        System.out.println("O2 group : " + o2Group);

        if(PP02 > MAX_02_Pressure){
            System.out.println("Exceeds maximal O2 pressure  : true");
        }
        else{
            System.out.println("Exceeds maximal O2 pressure     : false");
        }

        if(PP02 > CONTINGENCY_O2_PRESSURE){
            System.out.println("Exceeds contingency  O2 pressure  : true");
        }
        else{
            System.out.println("Exceeds contingency  O2 pressure     : false");
        }




    }// end of CalcAmbientPress


    
    public static void main(String[] args) {

        System.out.println("Week 5 Lab 3");

        int depth;
        int percentO2;

        //get data
        System.out.println("Enter depth and percentage O2 : ");
        depth = keyboard.nextInt();
        percentO2 = keyboard.nextInt();

        CalcAmbientPress(depth, percentO2);


    }// end of main method
} // end of ScubaNitrox Class
