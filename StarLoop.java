public class StarLoop {
	public static void main(String[] args) 
	{
		for (int line = 1; line <= 4; line++) {
			for (double stars = 1; stars <= -2 * line + 9; stars++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
