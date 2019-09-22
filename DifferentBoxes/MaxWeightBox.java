package boxes;

import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box {
    
    // Attributes
    private int maxWeight;
    private List<Thing> things;
    
    // Constructors
    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }

    // Methods
    public int getMaxWeight() {
        return this.maxWeight;
    }
    
    @Override
    public void add(Thing thing) {
        if(thing.getWeight() <= this.getMaxWeight()) {
            this.things.add(thing);
            this.maxWeight -= thing.getWeight();
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return this.things.contains(thing);
    }   
}
