package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Analysis {
    
    // Attributes
    private File file;
    
    // Constructor
    public Analysis(File file) {
        this.file = file;
    }
    
    // Methods
    public int lines() throws FileNotFoundException {
        
        // Create a scanner object
        Scanner scanner = new Scanner(this.file);
        
        // Create a local variable for lines
        int lines = 0;
        
        while(scanner.hasNextLine()) {
            String tempWord = scanner.nextLine();
            lines++;
        }
        return lines;
    }
    public int characters() throws FileNotFoundException {
    
        // Create a scanner object to read chars
        Scanner scanner = new Scanner(this.file);
        scanner.useDelimiter("");
        
        // Create a local variable for characters
        int chars = 0;
        
        while(scanner.hasNext()) {
            String tempChar = scanner.next();
            chars++;
        }
        return chars;
    }
}
