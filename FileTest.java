import java.io.*;

public class FileTest {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out = new PrintStream(new FileOutputStream("test2.txt", true));
        out.println("the new new new last line in test2.txt - is it the only line?");
        out.close();

        Scanner170 in = new Scanner170(new File("test2.txt"));
        while (in.hasNextLine()) {
            System.out.println("test2.txt contains: " + in.nextLine());
        }
    }
}
