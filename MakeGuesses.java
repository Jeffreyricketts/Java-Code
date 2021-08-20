import java.util.Random;

//Chp5B Assignment 2
public class MakeGuesses {
	public static void main(String[] args) {
		makeGuesses();

		}

	public static void makeGuesses() {
		int count; // Number of guesses
		int guess;

		count = 0;
		Random randy = new Random();
		guess = randy.nextInt(50) + 1;


		while(guess < 48){
			guess = randy.nextInt(50) + 1;
			count++;
			System.out.println("guess = " + guess);
		}
		System.out.println("total guesses = " + count);
	}
}
