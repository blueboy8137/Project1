import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.println("Week7 - Lab 5 Practice ");
        System.out.println(isFibonacci(13));
    }// end of main method
    public static boolean isPrime(int givenNumber){
//        int divisor;
//        for(divisor = 2; divisor < givenNumber; divisor++){
//            if(givenNumber % divisor == 0){
//                return false;
//            }
//
//        } // end of the for loop
//
//        return true;
        long divisor = 2;

        while (divisor <= Math.sqrt(givenNumber)) {
            if (givenNumber % divisor == 0) {
                System.out.println(givenNumber + " is divisible by " + divisor);
                return(false);
            }
            divisor++;
        }
        return(true);

    }// end of isPrime

    public static boolean isFibonacci(int givenNumber){

        int previous = 0;
        int current = 1;
        int next;
        int index;

        for(index = 0; index < givenNumber; index++){
            next = previous + current;
            if(next == givenNumber){
                return true;
            }
            previous = current;
            current = next;
        } // end of the for loop
        return false;

    }// end of isFibonacci method

}// end of the Practice class
