//Exam2 Question 1
public class ExamTwoPerfectNEW {
	public static void main(String[] args) {
	findPerfectNumbers(4);
	}
		public static void findPerfectNumbers(int howMany){
		int min;
		int max;
		int count; // to stop method
		int sum;
		min = 1;
		max = 10000; // needs bounds
		count = 0;


	if (count <= howMany) {
	for (min = 1; min <= max; min++) {
		sum = 0;
		for (int i = 1; i < min; i++) {
			if ((min % i) == 0) {
				sum += i;
			}
		}
		count++;
			if (sum == min) {
				System.out.println(sum);
			}
		}
		}
	}
}
