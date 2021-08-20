public class VariableValues {
	public static void main(String[] args) 
	{
		/* Division is evaluated first, before subtraction */
		int max;
		int min = 10;
		max = 17-4/10;
		max = max+6;
		min = max-min;

		System.out.println(max * 2);
		System.out.println(max + min);
		System.out.println(max);
		System.out.println(min);





	}

}
