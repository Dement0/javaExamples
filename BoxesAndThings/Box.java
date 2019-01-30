import java.util.List;
import java.util.ArrayList;

public class Box implements ToBeStored {

    // Attributes
    private List<ToBeStored> box;
    private double maxWeight;
    
    // Constructors
    public Box() {
        this(10);
    }
    
    public Box(double maxWeight) {
        this.box = new ArrayList<ToBeStored>();
        this.maxWeight = maxWeight;
    }
    
    // Methods
    @Override
    public double weight() {
        double weight = 0;
        for(ToBeStored item : this.box) {
            weight += item.weight();
        }
        return weight;
    }
    
    public double getMaxWeight() {
        return this.maxWeight;
    }
    
    public int howManyItems() {
        return this.box.size();
    }
    
    public void add(ToBeStored item) {
        double actWeight = this.weight();
        double tempWeight = actWeight + item.weight();
        if(tempWeight <= this.getMaxWeight()) {
            // Add the item
            this.box.add(item);
        }
    }
    
    // Utilities
    @Override
    public String toString() {
        return "Box: " + this.howManyItems() + " things, total weight " + 
                this.weight() + " kg";
    }
}
