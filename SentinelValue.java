import java.util.Scanner;

public class SentinelValue {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int score;
		int totalScore = 0;

		System.out.println("Enter your exam scores or -1 to stop");

		score = keyboard.nextInt();
		while (score !=-1 ) {
			totalScore += score;
			System.out.println("Enter your exam scores or -1 to stop");
			score = keyboard.nextInt();
		}
		System.out.println("The total is " + totalScore);
	}



}
