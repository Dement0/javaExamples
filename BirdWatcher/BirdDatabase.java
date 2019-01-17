// Key-Value pairs for the birdsObservationMap are name-observationNum
// Key-Value pairs for the birdsNamesMap are name-latinName

import java.util.Map;
import java.util.HashMap;

public class BirdDatabase {

    // Attributes
    private Map<String, Integer> birdsObservationMap;
    private Map<String, String> birdsNamesMap;
    
    // Constructors
    public BirdDatabase() {
        this.birdsObservationMap = new HashMap<String, Integer>();
        this.birdsNamesMap = new HashMap<String, String>();
    }
    
    // Methods
    public void add(Bird bird) {
        this.birdsObservationMap.put(bird.getName(), 0);
        this.birdsNamesMap.put(bird.getName(), bird.getLatinName());
    }
        
    public void observe(String name) {
        if(this.birdsObservationMap.containsKey(name)) {
            int observationAmount = this.birdsObservationMap.get(name);
            observationAmount++;
            this.birdsObservationMap.replace(name, observationAmount);
        }
    }
    
    public boolean hasBird(String name) {
        return this.birdsNamesMap.containsKey(name);
    }
    
    public void printStats() {
        // Prints the statictics of all the birds
        System.out.print(this);
        
    }
    
    public void show(String name) {
        // Prints one bird
        String result = "";
        result += name + " (" + this.birdsNamesMap.get(name) + "): " + 
                this.birdsObservationMap.get(name) + " observations";
        System.out.println(result);
    }
    
    // Utilities
    @Override
    public String toString() {
        String result = "";
        String name, latinName;
        int observedTimes;
        if(this.birdsObservationMap.isEmpty()) {
            result = "No registry found.";
        }
        else {
            for (Map.Entry<String, Integer> entry : this.birdsObservationMap.entrySet()) {
                name = entry.getKey();
                latinName = this.birdsNamesMap.get(name);
                observedTimes = entry.getValue();
                result += name + " (" + latinName + "): " + observedTimes + " observations" + "\n";
            }
        }
        return result;
    }
}
