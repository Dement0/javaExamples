import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Printer {

    // Attributes
    private File file;
    private String fileName;
    private Scanner scanner;
    
    // Constructor
    public Printer(String fileName) throws Exception {
        this.fileName = fileName;
        this.file = new File(fileName);
    }
    
    // Methods
    public void printLinesWhichContain(String word) throws FileNotFoundException {

        // Prints the file lines which contain the parameter word
        // If the argument is an empty string, print all of the file
        
        // Create a new scanner object to read the file
        this.scanner = new Scanner(this.file);
        
        if(word.isEmpty()) {
            while(this.scanner.hasNextLine()) {
                String tempWord = this.scanner.nextLine();
                System.out.println(tempWord);
            }
        } else {
            while(this.scanner.hasNextLine()) {
                String tempWord = this.scanner.nextLine();
                String tempLine = tempWord;
                if(tempLine.contains(word)) {
                    System.out.println(tempLine);
                }
            }
        }
    }
}
