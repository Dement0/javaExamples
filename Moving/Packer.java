package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Thing;
import moving.domain.Box;

public class Packer {
    
    // Attributes
    private int boxesVolume;
    private int currentBoxVolume;
    private List<Box> boxesList;
    
    // Constructor
    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
        this.currentBoxVolume = boxesVolume;
        this.boxesList = new ArrayList<Box>();
    }
    
    // Methods
    public List<Box> packThings(List<Thing> things) {
        for(Thing thing : things) {
            if(thing.getVolume() <= this.currentBoxVolume) {
                
                // Create a new box
                // TODO: Don't create a box for each item
                Box tempBox = new Box(this.boxesVolume);
                
                // If the box can contain the thing, add the box to the boxesList
                if(tempBox.addThing(thing)) {
                    this.boxesList.add(tempBox);
                    
                    // Decrement the current volume
                    this.currentBoxVolume -=thing.getVolume();
                }
            } else {
                // Create a new box
                Box tempBox = new Box(this.boxesVolume);
                
                // If the box can contain the thing, add the box to the boxesList
                if(tempBox.addThing(thing)) {
                    this.boxesList.add(tempBox);
                    
                    // Decrement the current volume
                    this.currentBoxVolume -=thing.getVolume();
                }
            }
        }
        return boxesList;
    }
}
