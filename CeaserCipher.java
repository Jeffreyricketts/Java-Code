import java.util.Locale; // Still have to figure a lot of stuff out :/

public class CeaserCipher {
	public static void main(String[] args) {
		ceasarCipher("dttack zerg at dawn", 3);


		}

	// Displays message about driving to user based on given age
	public static String ceasarCipher(String inputMessage, int shift) {
		Scanner170 console = new Scanner170(System.in);
		String codedMessage="";
		int letter;
		int codeLetter;
		String alphabet = "abcdefghijklmnopqrstuvwxyz";

		System.out.print("Enter message:");
		inputMessage = console.nextLine();

		System.out.print("Enter Shift:");
		shift = console.nextInt();

		for(int i=0; i<inputMessage.length(); i++) {
			if (alphabet.indexOf(inputMessage.substring(i,i+1))!=-1) {
				letter=alphabet.indexOf(inputMessage.substring(i,i+1));
				codeLetter=letter+shift;
				codeLetter%=26;
				codedMessage+=alphabet.substring(codeLetter,codeLetter+1);
			} else {
				codedMessage+=inputMessage.substring(i, i + 1);
			}
			System.out.print(codedMessage.toUpperCase(Locale.ROOT));
		}
		return codedMessage.toUpperCase(Locale.ROOT);
	}

}
