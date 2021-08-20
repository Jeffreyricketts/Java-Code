
public class NumUnique {
	public static void main(String[] args) {
	System.out.println(numUnique(2,2,4));
	System.out.println(numUnique(2,4,2));
	System.out.println(numUnique(4,2,2));
	System.out.println(numUnique(2,2,2));
	System.out.println(numUnique(2,3,4));

	}
	public static int numUnique(int n1, int n2, int n3) {
		if (n1 == n2 && n1 == n3) {
			return 1;
		} else if (n1 == n2 || n1 == n3 || n2 == n3) {
			return 2;
		} else {
			return 3;
		}
	}
}
