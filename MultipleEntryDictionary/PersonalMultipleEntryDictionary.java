package dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{
    
    // Attributes
    private Map<String, List<String>> dict;
    
    // Constructor
    public PersonalMultipleEntryDictionary() {
        this.dict = new HashMap<String, List<String>>();
    }

    @Override
    public void add(String word, String entry) {
        
        // Check if the word already exists, else create it
        if(!this.dict.containsKey(word)) {
            this.dict.put(word, new ArrayList<String>());
        }
        
        // Retrieve the list containing the word's entries and add the entry
        this.dict.get(word).add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        
        // If the word does not exist, return null
        if(!this.dict.containsKey(word)) {
            return null;
        }
        
        // Get the entries as list and convert the list to HashSet
        Set<String> translated = new HashSet<String>(this.dict.get(word));
        
        return translated;
    }

    @Override
    public void remove(String word) {
        this.dict.remove(word);
    }   
}
