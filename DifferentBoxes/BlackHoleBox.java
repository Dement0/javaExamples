package boxes;

public class BlackHoleBox extends Box {
    
    // Attributes
    private Thing thing;
    
    // Constructors
    public BlackHoleBox() {
        this.thing = null;
    }
    
    // Methods
    @Override
    public void add(Thing thing) {
        this.thing = thing;
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }   
}
