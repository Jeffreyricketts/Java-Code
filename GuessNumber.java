//Chp5 Assignment 1 Guess Number
import java.util.Random;
public class GuessNumber {
	public static void main(String[] args) {
		randonGuess();
		}

// Had to do a "do" loop because while loop made randomNumber de-initialized.
	public static void randonGuess() {
		int randomNumber;
		int guess;
		guess = 0;
		String user;

		Scanner170 console = new Scanner170(System.in);
		Random random = new Random();

		System.out.println("This program has you, the user, choose a number\nbetween 1 and 10. Then I, the computer, will try\nmy best to guess it.");
		do  {
			randomNumber = random.nextInt(9);
			guess++;

			System.out.print("Is it " + randomNumber + "? (y/n) ");
			user = console.next();

		}
		while (guess < 7);
			System.out.println("I got your number of " + randomNumber + " correct in " + guess + " guesses.");

	}
}
