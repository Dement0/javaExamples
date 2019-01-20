import java.util.Scanner;

public class Reader {

    // Attributes
    private Scanner reader;
    
    // Constructors
    public Reader() {
        reader = new Scanner(System.in);
    }
    
    // Methods
    public String readString() {
        return this.reader.nextLine();
    }
    
    public int readInteger() {
        // Normally should implement hasNext() method
        // but doesn't work with tests...
        return Integer.parseInt(this.reader.nextLine());
    }
}
