/* Using Scanner170 for a console interaction(:*/
public class ExamOneQ1 {
	public static void main(String[] args) {
		Scanner170 console = new Scanner170(System.in);
		System.out.print("General Kenobi!!! How many greetings do you want?");
		int greeting = console.nextInt();
		sayHello(greeting);

	}
	public static void sayHello(int num) {
		for (int i = 1; i <= num/2;i++ ){
			System.out.println("Hello There");
		}
	}
}
