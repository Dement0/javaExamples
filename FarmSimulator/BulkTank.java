package farmsimulator;

public class BulkTank {

    // Attributes
    private double capacity;
    private double volume;
    
    // Constructors
    public BulkTank() {
        this(2000);
    }
    
    public BulkTank(double capacity) {
        this.capacity = capacity;
        this.volume = 0.0;
    }
    
    // Methods
    public double getCapacity() {
        return this.capacity;
    }
    
    public double getVolume() {
        return (this.volume);
    }
    
    public double howMuchFreeSpace() {
        return (this.getCapacity() - this.getVolume());
    }
    
    public void addToTank(double amount) {
        this.volume += amount;
        
        // If volume is greater than the capacity, make them equal
        if(this.getVolume() > this.getCapacity()) {
            this.volume = this.getCapacity();
        }
    }
    
    public double getFromTank(double amount) {
        // Decrement the volume
        this.volume -= amount;
        
        // If amount is more than the volume, return volume
        if(amount > this.getVolume()) {
            this.volume = 0.0;
            return this.getVolume();
        }
        
        // Else, return amount
        return amount;
    }
    
    @Override
    public String toString() {
        return (Math.ceil(this.getVolume()) + "/" + Math.ceil(this.getCapacity()));
    }
}
