package moving.domain;

public class Item implements Thing, Comparable<Item> {

    // Attributes
    private String name;
    private int volume;
    
    // Constructor
    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    // Methods
    public String getName() {
        return this.name;
    }
    
    public int getThingVolume() {
        return this.volume;
    }
    
    @Override
    public int getVolume() {
        return getThingVolume();
    }
    
    @Override
    public String toString() {
        return this.getName() + " (" + this.getVolume() + " dm^3)";
    }

    @Override
    public int compareTo(Item other) {
        Integer thisVolume = (Integer) this.getVolume();
        Integer otherVolume = (Integer) other.getVolume();
        return (thisVolume.compareTo(otherVolume));
    }
}
