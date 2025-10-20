import java.util.Scanner;

/**
 *
 */
public class FascinatingNumber {
    private static final Scanner keyboard = new Scanner(System.in);
    private static final int NUM_ALLOWED = 10;

    public static void main(String[] args) {
        System.out.println("Week 7 - LAB 5 FASCINATING NUMBER");
        int [] numberArray = new int[NUM_ALLOWED];
        int amountOfNum;
        amountOfNum = getNumberToFillTheGivenArray(numberArray);
        displayData(numberArray, amountOfNum);

    }

    /**
     *
     * @param givenNumber
     * @return
     */
    public static boolean isPrime(int givenNumber) {
        int divisor;
        for(divisor = 2; divisor < givenNumber; divisor++){
            if(givenNumber % divisor == 0){
               return false;
           }

       } // end of the for loop

       return true;

    }// end of isPrime

    /**
     *
     * @param givenNumber
     * @return
     */
    public static boolean isFibonacci(int givenNumber) {

        int previous = 0;
        int current = 1;
        int next;
        int index;

        for (index = 0; index < givenNumber; index++) {
            next = previous + current;
            if (next == givenNumber) {
                return true;
            }
            previous = current;
            current = next;
        } // end of the for loop
        return false;

    }// end of isFibonacci method

    /**
     *
     * @param givenArray
     * @return
     */
    public static int getNumberToFillTheGivenArray(int[] givenArray) {

        int number = 1;
        int count = 0;

        System.out.println("Enter a number (0 to stop) : ");
        do {

            number = keyboard.nextInt();
            givenArray[count] = number;
            count++;

        } while (number != 0 && count < givenArray.length);
        return count;


    }// end of getNumberToFillTheGivenArray

    /**
     * 
     * @param givenArray
     * @param count
     */
    public static void displayData(int [] givenArray, int count){
        for (int i = 0; i < count - 1; i++){

            boolean isFibonacciNumber = isFibonacci(givenArray[i]);
            boolean isPrimeNumber = isPrime(givenArray[i]);




            if ( isFibonacciNumber && isPrimeNumber){
                System.out.println(givenArray[i] + " is Fibonacci and is prime");
            }
            else if (!isFibonacciNumber && isPrimeNumber) {
                System.out.println(givenArray[i] + " is not Fibonacci and is prime");
            }
            else if (isFibonacciNumber && !isPrimeNumber) {
                System.out.println( givenArray[i] + " is Fibonacci and is not prime");
            }
            else {
                System.out.println( givenArray[i] + " is not Fibonacci and is not prime");
            }
        }

    } // end of displayData


} // end of FascinatingNumbers methods
