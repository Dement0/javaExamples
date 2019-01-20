import java.util.List;
import java.util.ArrayList;

public class Suitcase {

    // Attributes
    private List<Thing> things;
    private int currentWeight;
    private int maxWeightLimit;
    
    // Constructors
    public Suitcase() {
        this(20);
    }
    
    public Suitcase(int maxWeightLimit) {
        this.things = new ArrayList<Thing>();
        this.currentWeight = 0;
        this.maxWeightLimit = maxWeightLimit;
    }
    
    // Setters & Getters
    public void setMaxWeigthLimit(int maxWeightLimit) {
        this.maxWeightLimit = maxWeightLimit;
    }
    
    public int getMaxWeightLimit() {
        return this.maxWeightLimit;
    }
    
    public void incrementCurrentWeight(int weightToBeAdded) {
        int temp = this.getCurrentWeight();
        temp += weightToBeAdded;
        this.currentWeight = temp;
    }
    
    public int getCurrentWeight() {
        return this.currentWeight;
    }
    
    // Methods
    public void addThing(Thing thing) {
        // Check if canAddThing
        if(canAddThing(thing)) {
            this.things.add(thing);
            // Increment the current weight
            this.incrementCurrentWeight(thing.getWeight());
        }
    }
    
    public Thing heaviestThing() {
        if(this.things.isEmpty()) {
            return null;
        }
        Thing heaviest = things.get(0);
        for(Thing thing : things) {
            if(thing.getWeight() > heaviest.getWeight()) {
                heaviest = thing;
            }
        }
        return heaviest;
    }
    
    
    // Utilities  
    public boolean canAddThing(Thing thing) {
        int tempWeight = this.getCurrentWeight() + thing.getWeight();
        return (tempWeight <= this.getMaxWeightLimit());
    }
    
    public void printThings() {
        for(Thing thing : things) {
            System.out.println(thing);
        }
    }
    
    public int totalWeight() {
        return this.getCurrentWeight();
    }
    
    @Override
    public String toString() {
        int size = this.things.size();
        String result;
        switch (size) {
            case 0:
                result = "empty (0 kg)";
                break;
            case 1:
                result = "1 thing (" + this.getCurrentWeight() + " kg)";
                break;
            default:
                result = size + " things (" + this.getCurrentWeight() + " kg)";
                break;
        }
        return result;
    }
}
