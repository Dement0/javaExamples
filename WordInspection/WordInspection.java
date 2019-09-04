package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {

    // Attributes
    private File file;
    
    // Constructors
    public WordInspection(File file) {
        this.file = file;
    }
    
    // Methods
    public int wordCount() throws FileNotFoundException {
        
        // Create a scanner object
        Scanner scanner = new Scanner(this.file);
        
        // Create a local variable for wordCount
        int wordCount = 0;
        
        while(scanner.hasNext()) {
            scanner.next();
            wordCount++;
        }
        return wordCount;
    }
    
    public List<String> wordsContainingZ() throws FileNotFoundException {
    
        // Create a scanner object
        Scanner scanner = new Scanner(this.file);
        
        // Create an arrayList to store words
        List<String> wordList = new ArrayList<String>();
        
        // Create a local variable to store words
        String tempWord;
        
        while(scanner.hasNext()) {
            tempWord = scanner.next();
            if(tempWord.contains("z")) {
                wordList.add(tempWord);
            }
        }
        return wordList;
    }
    
    public List<String> wordsEndingInL() throws FileNotFoundException {
    
        // Create a scanner object
        Scanner scanner = new Scanner(this.file);
                
        // Create an arrayList to store words
        List<String> wordList = new ArrayList<String>();
        
        // Create a local variable to store words
        String tempWord;
        
        while(scanner.hasNext()) {
            tempWord = scanner.next();
            if(tempWord.endsWith("l")) {
                wordList.add(tempWord);
            }
        }
        return wordList;
    }
    
    public List<String> palindromes() throws FileNotFoundException {
    
        // Create a scanner object
        Scanner scanner = new Scanner(this.file);
        
        // Create an arrayList to store words
        List<String> wordList = new ArrayList<String>();
        
        // Create a local variable to store words
        String tempWord;
        String reverse = "";
        
        while(scanner.hasNext()) {
            tempWord = scanner.next();
            reverse = "";
            
            // Reverse the string
            for(int i = tempWord.length() - 1; i >= 0; i--) {
                reverse += tempWord.charAt(i);
            }
            if(tempWord.equals(reverse)) {
                wordList.add(tempWord);
            }
        }
        return wordList;
    }
    
    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException {
    
        // Create a scanner object
        Scanner scanner = new Scanner(this.file);
        
        // Create an arrayList to store words
        String tempWord;
        String vowels = "aeiouyäö";
        boolean broke = false;
        
        // Create an arrayList to store words
        List<String> wordList = new ArrayList<String>();
        
        while(scanner.hasNext()) {
            broke = false;
            tempWord = scanner.next();
            
            for(int i=0; i<8; i++) {
                System.out.println(String.valueOf(vowels.charAt(i)));
                if(!(tempWord.contains(String.valueOf(vowels.charAt(i))))) {
                    broke = true;
                    break;
                }
            }
            
            // If loop was not broken, tempWord contains all vowels
            if(!(broke)) {
                wordList.add(tempWord);
                System.out.println(tempWord);
            }
        }
        return wordList;
        
        
    }
}
