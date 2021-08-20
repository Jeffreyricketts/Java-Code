
public class IfOops {
	public static void main(String[] args) {
		int a = 7, b = 42;
		int smaller = minimum(a,b); // declare smaller = minimum
		if (smaller == a) { // curly to brackets
			System.out.println("a is the smallest!");
		}

	} // change void to int
	public static int minimum(int a, int b) { // returns which int is smaller
		int smaller; // declare variable
		if (a < b) {
			return smaller = a; // change int to return
		} else { // remove a > b
			return smaller = b; // change int to return
		}
	}
}
