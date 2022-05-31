import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Random random = new Random();
        int minimum = 1;
        int maximum = 500;
        System.out.println("Guess the number between 1 to 500 n 0 to exit");
        Scanner scanner = new Scanner(System.in);
        int userNumber =0 ;
        Guess guess = new Guess();
        int computerNumber = guess.getRandom(minimum, maximum);
        while (true) {
            System.out.println("Guess the number or pre 0 to exit ");
              userNumber = scanner.nextInt();
              if (userNumber==0) break;
            if(userNumber < 1 || userNumber > 500) {
                System.out.println("Pee enter vi number.");
                continue;
            }
            if (userNumber == computerNumber) {
                System.out.println("Your Guess is correct: " + computerNumber);
                break;

            } else if (userNumber > computerNumber) {
                System.out.println("Your Guess is greter thn computerNumber");
            } else {

                System.out.println("Your Guess is e thn computerNumber");
            }

        }
    }
    public int getRandom(int minimum, int maximum){
        return ((int)(Math.random()*(maximum-minimum)))+minimum;
    }
}
