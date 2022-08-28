import java.util.Scanner;

import javax.print.event.PrintJobListener;

public class GuessTheNumber {

    static class Game {
        private int number;
        public int n;
        public int noOfGuesses = 0;
        boolean check = false;

        public Game() {
            number = 45;
        }

        public void takeUserInput() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nPlease enter a number between 1 and 100: ");
            n = scanner.nextInt();
        }

        public void isCorrectNumber() {
            if (number > n) {
                System.out.println("The guess is smaller than the number, try again!");
            } else if (number < n) {
                System.out.println("The guess is larger than the number, try again!");
            } else {
                System.out.println("Congratulations, you have guessed the correct number!");
                check = true;
            }
        }
    }

    public static void main(String[] args) {
        Game guess = new Game();

        while (guess.check == false) {
            guess.takeUserInput();
            guess.isCorrectNumber();
            guess.noOfGuesses++;
        }
        System.out.println("\nThe total number of guesses were = " + guess.noOfGuesses);
    }
}
