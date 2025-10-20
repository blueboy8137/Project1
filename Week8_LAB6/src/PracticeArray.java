import java.util.Scanner;
public class PracticeArray {

    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Week 8 - LAB 6 Practice Arrays");

        System.out.println("Enter the row size of the array");
        int arrayRow = keyboard.nextInt();

       int[][] yourArray = new int[arrayRow][];

        for (int row = 0; row < yourArray.length; row++) {
            System.out.println("At row " + row + ": Eneter the number of columns");
            int numberOfColumns = keyboard.nextInt();

            yourArray[row] = new int[numberOfColumns];

            for (int column = 0; column < yourArray[row].length; column++) {

                System.out.println("At row [" + row + "," + column + "]: Enter the value to be stored :");
                yourArray[row][column] = keyboard.nextInt();
            }// end of column loop

        }// end of the outer for loop
        // display the 2D Irregular Arrays
        for (int row = 0; row < yourArray.length; row++) {
            for (int column = 0; column < yourArray[row].length; column++) {

                System.out.println("At row [" + row + "," + column + "]:  The value is :" + yourArray[row][column]);

            }// end of column loop

        }// end of the outer for loop



    }// end of the main method

    public static void fillArray(int[] givenArray){
        for (int index = 0; index < givenArray.length; index++){

            System.out.print("At index " + index + ": Please enter a value: ");
            givenArray[index] = keyboard.nextInt();
        }

        //display the content of the array

        for (int index = 0; index < givenArray.length; index++){

            System.out.println("At index " + index + ": The value is: " + givenArray[index]);
        }
    }// end of the fillArray method

} // end of PracticeArray class
