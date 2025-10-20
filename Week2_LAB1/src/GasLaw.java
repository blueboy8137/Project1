//=============================================================================

import java.util.Scanner;

public class GasLaw {
    //-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final double GAS_CONSTANT = 8.3143;
    //----The gas constant in Joules/mole/
    //-----------------------------------------------------------------------------
    public static void main(String[] args) {

    //----Variables to hold system values
        double volume, moles;
        double pressure, temperature;

        //---Getting the volume moles and temperature
        System.out.print("Enter volume, moles, temperature : ");
        volume = keyboard.nextDouble();
        moles = keyboard.nextDouble();
        temperature= keyboard.nextDouble();

        //----Calculating pressure
        pressure = moles * GAS_CONSTANT * temperature / volume;

        //----Outputting answer
        System.out.print("Pressure is ");
        System.out.printf("%.2f", pressure);
    }//end of main method

} // end of GasLaw class

//-----------------------------------------------------------------------------
//=============================================================================