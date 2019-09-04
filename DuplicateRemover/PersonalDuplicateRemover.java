package tools;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {
    
    // Attributes
    private int detectedDuplicates;
    private Map<String, Set<String>> noDuplicateMap;
    
    // Constructor
    public PersonalDuplicateRemover() {
        this.detectedDuplicates = 0;
        this.noDuplicateMap = new HashMap<String, Set<String>>();
    }

    @Override
    public void add(String characterString) {
        
        // If the key already exists, increment detectedDuplicates by 1
        if(this.noDuplicateMap.containsKey(characterString)) {
            detectedDuplicates++;
        }
        // Else, create a new key
        else {
            this.noDuplicateMap.put(characterString, new HashSet<String>());
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.detectedDuplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.noDuplicateMap.keySet();
    }

    @Override
    public void empty() {
        Iterator it = this.noDuplicateMap.entrySet().iterator();
        while (it.hasNext())
        {
           Entry item = (Entry) it.next();
           it.remove();
        }
        this.detectedDuplicates = 0;
    }
}
