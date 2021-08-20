import java.util.Arrays;

public class ExamTwoFriends {
	public static void main(String[] args) {

		System.out.print(Arrays.toString(friends(6 )));
		}

	// Displays names
	public static String[] friends(int howMany) {
		//Create an array of howMany names
		// Prompt user to put names
		while (howMany < 5 || howMany > 50 ) {
			throw new IllegalArgumentException("Invalid, Give us a name please: ");

		}
		String[] names;
		names = new String[howMany];
		Scanner170 console = new Scanner170();
		for(int i = 0; i < howMany; i++){
			System.out.print("Give us a name please: ");
			names[i] = console.nextLine();

		}
		return names;
	}
}
