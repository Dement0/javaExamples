import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Dictionary {

    // Attributes
    private Map<String, String> dict;
    
    // Constructors
    public Dictionary() {
        this.dict = new HashMap<String, String>();
    }
    
    // Methods
    public String translate(String word) {
        return this.dict.get(word);
    }
    
    public void add(String word, String translation) {
        this.dict.put(word, translation);
    }
    
    public int amountOfWords() {
        return this.dict.size();
    }
    
    public ArrayList<String> translationList() {
        ArrayList<String> result = new ArrayList<String>();
        for(String key : this.dict.keySet()) {
            String temp = key + " = " + this.dict.get(key);
            result.add(temp);
        }
        return result;
    }
}
