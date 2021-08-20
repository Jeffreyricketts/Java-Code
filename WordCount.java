import java.util.*;
import java.io.*;
import java.io.FileReader;
import java.io.File;

public class WordCount {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		hamletWords();
		hamletLines();
	}

	public static void hamletWords() throws FileNotFoundException, IOException {
		Scanner hamlet = new Scanner(new File("C:/COMP170/IntelliJ Java Programs/_my_Java_programs/src/hamlet.txt"));

		int numWords;
		numWords = 0;
		int numChar = 0;

		while (hamlet.hasNext()) {
			String word = hamlet.next();
			numChar += word.length();
			numWords++;
		}
		System.out.println("Number of words: " + numWords);
		System.out.println("Number of characters: " + numChar);
	}

	public static void hamletLines() throws FileNotFoundException, IOException {
		File hamlet = new File("C:/COMP170/IntelliJ Java Programs/_my_Java_programs/src/hamlet.txt");
		int numLines;
		numLines = 0;
		LineNumberReader lnr = new LineNumberReader(new FileReader(hamlet));
		while (lnr.readLine() != null) {
			numLines = lnr.getLineNumber();
		}
		System.out.println("Number of lines: " + numLines);
	}

}