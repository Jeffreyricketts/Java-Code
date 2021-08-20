public class BottlesBeer {
	public static void main(String[] args) 
	{

		for( int i = 10; i >= 1; i-- ) {
			System.out.println(i + " bottles of beer on the wall,"+ i + " bottles of beer");
			System.out.println("Take one down, pass it around, " + (i - 1) + " bottles of beer on the wall\n");
		}

	}

}
