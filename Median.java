
public class Median {
	public static void main(String[] args) {
		int[] tests =
						{1, 5, 10,		//answer 5 appears in all positions
						5, 1, 10,
						5, 10, 1,
						1, 10, 5,
						10, 5, 1,
						10, 1, 5,
						10, 1, 10, 	//two the same, bigger in middle, answer 10
						1, 10, 10,
						10, 10, 1,
						1,  1,  10,	//two the same, smaller in middle, answer 1
						10, 10, 10,	//all the same
						-1, 0, 1,		//mixed negative and positive, answer 0
						-1, -5, -10, 	//all negative, answer -5
						5, 5, 5 };
		for (int i=0; i < tests.length-2; i=i+3) {
			System.out.println(
					"Calling medianOf3(" + tests[i] + "," + tests[i + 1] + "," + tests[i + 2] + ") returns " +
							medianOf3(tests[i], tests[i + 1], tests[i + 2]) );
		}
	}
	public static int medianOf3(int n1, int n2, int n3) {
		if ((n1 < n2 && n1 < n3 && n2 < n3) || (n1 > n2 && n1 > n3 && n2 > n3)) {
			return n2;
		} else if ((n1 < n3 && n2 < n3 && n2 < n1) || (n1 > n3 && n2 > n3 && n2 > n1)) {
			return n1;
		} else {
			return n3;
		}
	}
}
