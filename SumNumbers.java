
public class SumNumbers {
	public static void main(String[] args) {
		Scanner170 console = new Scanner170(System.in);
		int low ;
		int high;
		System.out.print("low?");
		low = console.nextInt();

		System.out.print("high?");
		high = console.nextInt();

		int sum = 0;
		for(int i = low; i <= high; i++){
			sum += i;
		}
		System.out.println("sum = " + sum);
	}


}
