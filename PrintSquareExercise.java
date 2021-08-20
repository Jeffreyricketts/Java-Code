
public class PrintSquareExercise {
	public static void main(String[] args) {

		printSquare(3,7);


	}
	public static void printSquare(int min, int max){
		for(int row = min; row <= max; row++){
			for(int i = row; i <= max; i++){
				System.out.print(i);
			}
			for(int i = min; i < row; i++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
