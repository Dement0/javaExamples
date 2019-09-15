package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable{

    // Attributes
    private List<Movable> group;
    
    // Constructor
    public Group() {
        this.group = new ArrayList<Movable>();
    }
    
    // Methods
    @Override
    public String toString() {
        String result = "";
        for(Movable organism : this.group) {
            result += organism.toString() + "\n";
        }
        return result;
    }
    
    public void addToGroup(Movable movable) {
        this.group.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for(Movable movable : this.group) {
            movable.move(dx, dy);
        }
    }   
}
