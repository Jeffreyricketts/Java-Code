
import java.util.Scanner;

public class ArrayLab7 {
	public static void main(String[] args) {
		int[] numbers;
		int count;
		Scanner console = new Scanner(System.in);

		System.out.print("How many numbers will you enter? ");
		count = console.nextInt();
		numbers = new int[count];


		for (int i = 0; i < numbers.length; i++) {
			// your code goes here; store the numbers
			System.out.print("Type a number: ");
			numbers[i] = console.nextInt();


		}

		System.out.println();
		System.out.println("Your numbers in forward order:");

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);

		}

		System.out.println();
		System.out.println("Your numbers in backward order:");

		for (int i = numbers.length -1; i >= 0; i--) {
			System.out.println(numbers[i]);
		}
		// your code goes here; print the numbers in backward order
		}
	}

