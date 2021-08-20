// Chp4 lb 2Ex2
public class Pow {
	public static void main(String[] args) {
		System.out.println(pow(3,4));
		System.out.println(pow(10,5));
		System.out.println(pow(6,0));
		System.out.println(pow(-2,3));
		System.out.println(pow(-2,0));
	}
	public static int pow(int b, int e){
		int sum = 1;

		for (int i = 1; i<=e;i++){
			sum = sum * b;
		}
		return sum;
	}
}
