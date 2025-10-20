import java.util.Scanner;
public class DurbanHouseData {
    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Week 8 - Lab 6 Durban House Data");

        int totalAge = 0;
        int houseTotalAge = 0;

        System.out.println("How many houses in the street? : ");
        int numberOfPeople = keyboard.nextInt();
        //get the number
        int [] houseNumberArray = new int[numberOfPeople];
        numberOfHouses(houseNumberArray);

        int[][] houseAgesArray = new int[numberOfPeople][];
        inputHouseAges(houseNumberArray, houseAgesArray);

        for (int row = 0; row < houseAgesArray.length; row++) {
            for (int column = 0; column < houseAgesArray[row].length; column++) {

                houseTotalAge += houseAgesArray[row][column] ;


            }// end of column loop
            System.out.println("House " + houseNumberArray[row] + " has a total age of : " + houseTotalAge);
            totalAge += houseTotalAge;
            houseTotalAge = 0;
        }// end of outer for loop
        System.out.println("The street has a total age of :" + totalAge);


    } // end of main method

    public static void numberOfHouses(int[] houseNumberArray){

        for (int row = 0; row <  houseNumberArray.length; row++) {
            System.out.print("What is the next house number: ");
            houseNumberArray[row] = keyboard.nextInt();

        } // end of for loop

    } // end of numberOfHouses method

    public static void inputHouseAges(int [] houseNumbersArray, int[][] houseAgesArray){

        for (int row = 0; row < houseNumbersArray.length; row++) {
            System.out.println("How many people live in " + houseNumbersArray[row]);
            int numberOfColumns = keyboard.nextInt();

            houseAgesArray[row] = new int[numberOfColumns];

            for (int column = 0; column < houseAgesArray[row].length; column++) {

                System.out.println("What is the age of person " + (column + 1));
                houseAgesArray[row][column] = keyboard.nextInt();
            }// end of column loop

        }// end of the outer for loop

    }


}//end of the DurbanHouse class
