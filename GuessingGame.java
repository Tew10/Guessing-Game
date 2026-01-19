import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner leia = new Scanner (System.in);

    int attempt = 5;
    int numberUse = 0;
    int guessing = new Random().nextInt(100);

        System.out.println(" Guessing Game ");

        for (int i = 0; i < 5; i++) {

            System.out.println("You have "+ attempt + " attempts (a)");

            System.out.println("Enter a number from 1 to 100 to try and guess");
            numberUse = leia.nextInt();

            if(numberUse == guessing){

                System.out.println("Congratulations! You guessed it!");
            break;
            } else if (numberUse > guessing ){

                System.out.println("This number is smaller than the number to guess");

            } else{

                System.out.println("The number is higher than the number to guess");
            }
        attempt--;

            if(attempt == 0 && numberUse != guessing){

                System.out.println("You did not guess the number within the allowed number of attempts. The number was: " + guessing);
            }

        }


    leia.close();
    }
}
