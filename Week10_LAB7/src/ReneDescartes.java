import java.util.Scanner;

public class ReneDescartes {
    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter sentences, . to end.");
        String sentence = "";
        String qualites = "";
        do{
            sentence = keyboard.nextLine();
            if(sentence.startsWith("I am")){
                qualites = qualites.concat(",");
               qualites = qualites.concat(sentence.substring(4));

            }

        } while(!sentence.equals("."));
        System.out.println("The qualities are" + qualites);


    }

}// end of ReneDescartes class
