//CHp4 lb 2 Ex3
public class ReplEx3 {
	public static void main(String[] args) {
		System.out.println(repl("Hello", 3));
		System.out.println(numbers(2, 3));
		System.out.println(flowers("Dandylion", 5, 6 ));
		System.out.println(flowers("Dandylion", 5, 0 ));
	}


	public static String repl(String greeting, int num) {
		String sum = "";
		for (int i = 1; num > 0 && i <= num; i++) {
			sum = sum + greeting;
		}
		return sum;


	}

	public static int numbers(int greetingnum, int n) {
		int sum = 0;
		for (int i = 1; n > 0 && i <= n; i++) {
			sum = sum + greetingnum;
		}
		return sum;
	}

	public static String flowers(String flora, int price, int num ) {
		String plt = "";
		int money = 0;
		for(int i = 1; num > 0 && i<=num; i++){
			plt = plt+ flora+", ";
			money = money + price;
		}
		if (money > 0) {
			return plt + "$" + money;
		}
		else{
			return "Buy some now!!";
		}
	}

}
