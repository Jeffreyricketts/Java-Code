//CH4 ex10
public class PrintGpa {
	public static void main(String[] args) {
		Scanner170 input = new Scanner170(System.in);
		System.out.println(printGPA(input));


		}
	public static String printGPA(Scanner170 console) {

		String name;
		int num;
		int score;
		double sum = 0;
		double average = 0;

		System.out.print("Enter a student record: ");
		name = console.next();

		num = console.nextInt();
		for (int i = 0; i < num; i++) {
			score = console.nextInt();
			sum = sum + score;
		}
		if(num > 0) {
			average = sum / num;
		}
		return name + "'s grade is " + average;
		}



}
