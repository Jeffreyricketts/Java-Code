
public class TriangleTypeEx {
	public static void main(String[] args) {
		printTriangleType(5, 7, 7);
		printTriangleType(5, 5, 5); // I'm not writing that number haha
		printTriangleType(5, 7, 8);
		printTriangleType(2, 18, 2);
		printTriangleType(4, 5, 0);
	}
	public static void printTriangleType(int side1, int side2, int side3) {
		if(side1 > side2 + side3 || side2 > side1 + side3 || side3 > side1 + side2 || side1 == 0 ||
		side2 == 0 || side3 == 0){
			throw new IllegalArgumentException("***will cause exception and end program***");
		}// throw new for illegal argument
		if (side1 == side2 && side2 == side3) {
			System.out.println("equilateral");
		}
		else if (side1 == side2 || side2 == side3 || side1 == side3) {
			System.out.println("isosceles");
		}
		else {
			System.out.println("scalene");
		}
	}
}
