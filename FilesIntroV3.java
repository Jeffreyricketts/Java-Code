import java.io.*;

public class FilesIntroV3 {
    /**
     * A Simple introduction to reading and writing text files
     *
     * In IntelliJ, the default location for files is the project folder including your code
     * (not the src folder)
     *
     * @throws FileNotFoundException
     * @author WLHonig
     * @author RHYacobellis (change PrintWriter to PrintStream)
     */
    public static void main(String[] args) throws FileNotFoundException {
        //easyFileAdder("Stuff");
        easyFileReader("Stuff.txt");
    }

    public static boolean easyFileReader(String fileName) throws FileNotFoundException {
        File inputFile;
        Scanner170 inputScanner;
        inputFile = new File (fileName);
        inputScanner = new Scanner170(inputFile);

        int linesRead = 0;
        while( inputScanner.hasNextLine() ) {
            System.out.println( inputScanner.nextLine() );
            linesRead++;
        }
        System.out.println( "File finished with " + linesRead + " lines read back!");
        inputScanner.close();
        return true;
    }

    public static boolean easyFileAdder(String fileName) throws FileNotFoundException {
        FileOutputStream outputFile;
        outputFile = new FileOutputStream( fileName, true );  //true appends to current file
        PrintStream outputStream;
        outputStream = new PrintStream( outputFile );

        outputStream.println("Next Line for The File");
        outputStream.println("THE END");

        //important to ensure recent lines actually added; closes outputFile as well
        outputStream.close();
        return true;
    }
}
