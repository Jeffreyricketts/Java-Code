import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CheckIOV2 {
    /**
     * A simple introduction to finding and reading a file in IntelliJ or a Windows Command Prompt
     *
     * In IntelliJ, the default location for files is the project folder including your code
     * (not the src folder), but in the Windows Command Prompt it is in the src folder
     * The findFile method deals with both locations and works in IntelliJ or the Windows Command Prompt
     *
     * @throws FileNotFoundException
     * @author RHYacobellis
     */

    public static void main(String[] args)
            throws FileNotFoundException, IOException {

        String filename = "MyProgram.java";
        System.out.printf("lines of %s:%n", filename); // in the IntelliJ src folder
        Scanner170 in = new Scanner170(CheckIOV2.findFile(filename));
        while (in.hasNextLine()) {
            System.out.println(in.nextLine());
        }
        in.close();

        filename = "test.txt";
        System.out.println();
        System.out.printf("lines of %s:%n", filename); // in the IntelliJ project folder
        in = new Scanner170(CheckIOV2.findFile(filename));
        while (in.hasNextLine()) {
            System.out.println(in.nextLine());
        }
        in.close();
    }
    /**
     * A method to locate an existing file in the IntelliJ project folder or src folder
     *
     * In IntelliJ, the default location for files is the project folder including your code
     * (not the src folder), but in the Windows Command Prompt it is in the src folder
     * This method deals with both locations and works in IntelliJ or the Windows Command Prompt
     *
     * @author RHYacobellis
     * @param filename the name of the file to find, typically its short name, not a full path
     * @return a File object connected to the file if it exists in the project or src folder
     * @throws FileNotFoundException
     * @implNote call this method via CheckIOV2.findFile
     */

    public static File findFile(String filename) throws FileNotFoundException, IOException {
        Path filePath;
        try (Stream<Path> paths = Files.walk(Paths.get("."), 10)) { // try current folder
            filePath = paths.filter(Files::isRegularFile)
                    .filter(p -> p.toString().endsWith("\\" + filename))
                    .findFirst()
                    .get();
            return new File(filePath.toString());
        } catch (Exception e) {
            // ignore this exception, try another folder
        }

        try (Stream<Path> paths = Files.walk(Paths.get("../../"), 10)) { // try two folders up
            filePath = paths.filter(Files::isRegularFile)
                    .filter(p -> p.toString().endsWith("\\" + filename))
                    .findFirst()
                    .get();

            return new File(filePath.toString());
        } catch (Exception e) {
            throw new FileNotFoundException("file could not be found: " + filename);
        }
    }
}
