// Chp4 lb 2Ex4
public class LongestNameEx {
	public static void main(String[] args) {
		Scanner170 input = new Scanner170(System.in);
		System.out.println(longestName(input, 2));
	}
	public static String longestName(Scanner170 console, int num) {
		String somebody;
		String currentSomebody;
		System.out.print("Name #1? ");
		somebody = console.next();
		for (int i = 2; i <= num; i++) {
			System.out.print("Name #" + i + "? ");
			currentSomebody = console.next();
			if (currentSomebody.length() > somebody.length()) {
				somebody = currentSomebody;
			}
		}
		somebody = somebody.substring(0,1).toUpperCase() + somebody.substring(1,somebody.length()).toLowerCase();
		 //somebody = somebody.toLowerCase() + somebody.substring(0,1).toUpperCase(); # Adds uppercase to bottom
			return somebody + "'s name is the longest";
		}
}
