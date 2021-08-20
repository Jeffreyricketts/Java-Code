
public class DistanceExercise {
	public static void main(String[] args) {

		double result1 = distance(1,0,4,4);
		double result2 = distance(10,2,3,15);
		double result3 = distance(10,2.5,4,13);


		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

	public static double distance( double x1, double y1, double x2, double y2) {
		double d;
		return  d = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));


	}

}
