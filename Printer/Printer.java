import java.util.Scanner;

public class Printer {

    // Attributes
    private String fileName;
    private Scanner scanner;
    
    // Constructor
    public Printer(String fileName) throws Exception {
        this.fileName = fileName;
    }
    
    // Methods
    public void printLinesWhichContain(String word) {
        
        // Prints the file lines which contain the parameter word
        // If the argument is an empty string, print all of the file
        
        // Create a new scanner object to read the file
        this.scanner = new Scanner(this.fileName);
        
        if(word.isEmpty()) {
            while(this.scanner.hasNextLine()) {
                String tempWord = this.scanner.nextLine();
                System.out.println(tempWord);
            }
        } else {
            while(this.scanner.hasNextLine()) {
                String tempWord = this.scanner.nextLine();
                if(tempWord.equals(word)) {
                    System.out.println(tempWord);
                }
            }
        }
    }
}
