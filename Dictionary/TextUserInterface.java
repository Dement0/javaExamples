import java.util.Scanner;

public class TextUserInterface {

    // Attributes
    private Scanner reader;
    private Dictionary dictionary;
    
    // Constructors
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }
    
    public void start() {
        while(true) {
            System.out.println("Statements: ");
            System.out.println("  add - adds a word pair to the dictionary");
            System.out.println("  translate - asks a word and prints its translation ");
            System.out.println("  quit - quit the text user interface");
            System.out.print("Statement: ");
            
            String input = reader.nextLine();
            if(input.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if(input.equals("add")) {
                System.out.print("In Finnish: ");
                String word = reader.nextLine();
                System.out.print("Translation: ");
                String translation = reader.nextLine();
                this.dictionary.add(word, translation);
            } else if(input.equals("translate")) {
                System.out.print("Give a word: ");
                String word = reader.nextLine();
                String translation = this.dictionary.translate(word);
                System.out.println("Translation: " + translation);
            } else {
                System.out.println("Unknown statement");
            }
        }
    }
}
