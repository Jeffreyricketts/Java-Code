public class Lanterns {
	public static void main(String[] args) 
	{
		triangle();
		System.out.println();
		triangle();
		pipe();
		longLine();
		triangle();
		System.out.println();
		triangle();
		shortLine();
		pipe();
		pipe();
		shortLine();
		shortLine();
	}
	public static void triangle() {
		System.out.println("    *****    \n  *********  \n*************");
	}
	public static void pipe() {
		System.out.println("* | | | | | *");
	}
	public static void shortLine() {
		System.out.println("    *****    ");
	}
	public static void longLine() {
		System.out.println("*************");
	}
}
