import java.util.List;
import java.util.ArrayList;

public class Container {

    // Attributes
    private int maxWeightLimit;
    private int currentWeight;
    private List<Suitcase> container;
    
    // Constructors
    public Container() {
        this(0);
    }
    
    public Container(int maxWeightLimit) {
        this.maxWeightLimit = maxWeightLimit;
        this.currentWeight = 0;
        this.container = new ArrayList<Suitcase>();
    }
    
    // Setters & Getters
    public void addWeight(int weight) {
        int temp = this.currentWeight;
        temp += weight;
        this.currentWeight = temp;
    }
    
    public int getCurrentWeight() {
        return this.currentWeight;
    }
    
    public int getMaxWeightLimit() {
        return this.maxWeightLimit;
    }
    
    // Methods
    public void addSuitcase(Suitcase suitcase) {
        if(canAdd(suitcase)) {
            this.container.add(suitcase);
            this.addWeight(suitcase.getCurrentWeight());
        }
    }
    
    public boolean canAdd(Suitcase suitcase) {
        int current = this.getCurrentWeight();
        current += suitcase.getCurrentWeight();
        return (current <= this.getMaxWeightLimit());
    }
    
    // Utilities
    public void printThings() {
        for(Suitcase suitcase : container) {
            suitcase.printThings();
        }
    }
    
    @Override
    public String toString() {
        String result;
        result = this.container.size() + " suitcases (" + this.getCurrentWeight() + " kg)";
        return result;
    }   
}
