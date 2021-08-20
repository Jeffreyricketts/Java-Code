//Chp 5B ex1
// Accidentally submitted 'printFactors' for Holy Digits so they will have to be switched

/*  All four digits are different
	Th digit in the thousands place is three times the digit in the tens place
	The number is odd
	The sum of the digits is 27
 */
public class HolyDigits {
	public static void main(String[] args) {
System.out.println(holyDigits());
		}


	public static int holyDigits() {
		int thousand;
		int hundred;
		int tens;
		int ones;
		// Ans = 9837, 0 - 9999

		for (int i = 1001; i <= 9999; i = i + 2) {
			ones = i % 10;
			tens = (i / 10) % 10;
			hundred = (i / 100) % 10;
			thousand = (i / 1000);
			if ((thousand + hundred + tens + ones == 27) &&
					(ones / 2 != 0) &&
					(tens * 3 == thousand) &&
					(thousand != hundred && thousand != tens && thousand != ones && hundred != tens && hundred != ones && tens != ones)) {
				return i;
			}
		}
		return 0;
	}
}
