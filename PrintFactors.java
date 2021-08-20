//Chp5B Assignment 1
public class PrintFactors {
	public static void main(String[] args) {
		printFactors(24);
		printFactors(13);
		printFactors(40);
		printFactors(28);
		printFactors(6);
	}

	public static void printFactors(int num){
			while (num <= 0) {
				throw new IllegalArgumentException("Numbers Zero and under are invalid");

			}
			int sum = 1;
			System.out.print(1);
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					System.out.print(" + " + i);
					sum = sum + i;
				}
			}
				System.out.print(" = " + sum + " " + num);
				System.out.println();
			}
		}

