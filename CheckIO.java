import java.io.*;

public class CheckIO {
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
            throws FileNotFoundException {

        System.out.println("lines of MyProgram.java:"); // in the IntelliJ src folder
        Scanner170 in = new Scanner170(findFile("MyProgram.java"));
        while (in.hasNextLine()) {
            System.out.println(in.nextLine());
        }
        in.close();

        System.out.println();
        System.out.println("lines of test.txt:"); // in the IntelliJ project folder
        in = new Scanner170(findFile("test.txt"));
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
     * @throws FileNotFoundException
     * @author RHYacobellis
     * @param filename the name of the file to find, typically its short name, not a full path
     * @return a File object connected to the file if it exists in the project or src folder
     * @implNote this method will also work if a full path to the file is provided
     */

    public static File findFile(String filename) throws FileNotFoundException {
        File file = new File(filename); // first try the name by itself
        // this works for an IntelliJ program if the file is in the IntelliJ project folder,
        // and for a Windows Command Prompt program if the file is in the src folder
        if (file.exists()) {
            return file;
        }
        file = new File("../../" + filename); // now try two folders above the current one
        // this is where a program created in a Windows Command Prompt will find a file that
        // is located in the IntelliJ project folder
        if (file.exists()) {
            return file;
        }
        file = new File("_my_Java_programs/src/" + filename); // now try the src folder
        // this is where an IntelliJ program will find a file located in the src folder
        if (file.exists()) {
            return file;
        }
        // the file does not exist in any of those folders, throw an exception
        throw new FileNotFoundException(filename + " could not be found");
    }
}
