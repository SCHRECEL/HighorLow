import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        boolean ready = false;
        int guess = 0;


        do {

            int randNumber = rand.nextInt(10);
            randNumber = randNumber + 1;

            System.out.println("Guess the number! 0 to exit.");
            guess = scanner.nextInt();


            if (guess == 0){
                ready = true;
            } else if (guess > 0) {
                if (guess == randNumber){
                    System.out.println("You are on the money!");
                    System.out.println("It was " +randNumber+".");
                    ready = true;
                    System.out.println("Exiting");
                }
                else if (guess > randNumber){
                    System.out.println("You are high.");
                    System.out.println("It was " +randNumber+".");
                } else if (guess < randNumber) {
                    System.out.println("You are low.");
                    System.out.println("It was " +randNumber+".");
                }
            }


        }while(!ready);
    }
}