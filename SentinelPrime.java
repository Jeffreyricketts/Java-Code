
public class SentinelPrime {
	public static void main(String[] args) {
		//Sentinel loop to gather input until a certain value is reached
		//Get numbers from user until a 0 is entered (you can add them up and return the sum)
		sentinel();
	}
	public static int sentinel(){
		Scanner170 console = new Scanner170();
		int trys;
		int num;



		System.out.print("Enter value or 0 to stop: ");
		num = console.nextInt();
		trys =1;

		while(num != 0){
			System.out.print("Enter value or 0 to stop: ");
			num = console.nextInt();
			trys = trys + 1;
		}
		System.out.println(trys);
		return trys;

	}



}
