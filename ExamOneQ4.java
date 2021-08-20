
public class ExamOneQ4 {
	public static void main(String[] args) {
	printMultiples(3, 5);
	printMultiples(7, 3);
	printMultiples(-2, 4);
	printMultiples(0, 7);


	}
	public static void printMultiples(int number, int howMany){
		System.out.print("The first " + howMany + " multiples of " + number + " are ");
		for( int i = 1; i <= howMany; i++)
			System.out.print((number*i) + ", ");
			System.out.println();
	}


}
