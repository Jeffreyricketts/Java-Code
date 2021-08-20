
public class Quadrant {
	public static void main(String[] args) {
	System.out.println(quadrant(2,2));
	System.out.println(quadrant(2,-2));
	System.out.println(quadrant(-2,2));
	System.out.println(quadrant(-2,-2));
	System.out.println(quadrant(0,0));

	}
	public static double quadrant(double n1, double n2) {
		if (n1 == 0 && n1 == 0) {
			return 0;
		} else if (n1>0 && n2>0) {
			return 1;
		} else if (n1<0 && n2>0) {
			return 2;
		} else if (n1<0 && n2<0){
			return 3;
		} else{
			return 4;
		}
	}
}
