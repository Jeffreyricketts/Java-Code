import java.util.Arrays;

public class ArrayNames {
	public static void main(String[] args) {
		String[] friends;
		friends = getNames(7);
		for(int i = 0; i < friends.length; i++){
		}
		System.out.println(Arrays.toString(friends));
	}

	public static String[] getNames(int howMany) {
		//Create an array of howMany names
		// Prompt user to put names

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
