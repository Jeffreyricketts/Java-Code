import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
// To read a file and print the content
public class StuffGetter {
	public static void main(String[] args)throws FileNotFoundException {
		Scanner stuff = new Scanner(new File("C:/COMP170/IntelliJ Java Programs/_my_Java_programs/src/Stuff.txt"));
		while(stuff.hasNext()) {
			System.out.print(stuff.next() + " ");

		}
	}
}
