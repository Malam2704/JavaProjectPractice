import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random rand = new Random();
        int systemRandomNumber = rand.nextInt(101) - 1;

        System.out.println("Enter a number from 1-100: ");
        int userInt = myScanner.nextInt();

        int tries = 1;
        while (true) {
            if (userInt > systemRandomNumber) {
                System.out.println("Real number is lower, try again: ");
                userInt = myScanner.nextInt();
                tries++;
            } else if (userInt < systemRandomNumber) {
                System.out.println("Real number is higher, try again: ");
                userInt = myScanner.nextInt();
                tries++;
            } else if (userInt == systemRandomNumber) {
                System.out.println("Your guessed number Correct! ");
                break;
            }
        }

        System.out.println("You got the correct answer in " + tries + " guesses!");
        myScanner.close();
    }
}