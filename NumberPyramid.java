
public class NumberPyramid {
	public static final int PYRAMID_SIZE = 13;

	public static void main(String[] args) {
		for (int i =1; i <= PYRAMID_SIZE;  i++){
			for(int j = 1; j <= i; i++){
				System.out.print(i);
			}
			System.out.println();
		}

	}
}
