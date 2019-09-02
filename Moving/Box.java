package moving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {
    
    // Attributes
    private int maximumCapacity;
    private List<Thing> thingsList;
    
    // Constructor
    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.thingsList = new ArrayList<Thing>();
    }
    
    // Methods
    public boolean addThing(Thing thing) {
        if(thing.getVolume() > this.maximumCapacity) {
            return false;
        }
        
        // Store the thing in the list
        this.thingsList.add(thing);
        
        // Decrement the box capacity
        this.maximumCapacity -= thing.getVolume();
        
        return true;
    }

    @Override
    public int getVolume() {
        int currentVolume = 0;
        for(Thing t : this.thingsList) {
            currentVolume += t.getVolume();
        }
        return currentVolume;
    }
}
