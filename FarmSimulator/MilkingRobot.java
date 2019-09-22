package farmsimulator;

public class MilkingRobot {

    // Attributes
    private BulkTank bulk_tank;
    
    // Constructors
    public MilkingRobot() {
        this.bulk_tank = null;
    }
    
    // Methods
    public BulkTank getBulkTank() {
        return this.bulk_tank;
    }
    
    public void setBulkTank(BulkTank tank) {
        this.bulk_tank = tank;
    }
    
    public void milk(Milkable milkable) throws IllegalStateException {
        // If no tank has been connected to MilkingRobot, throw exception 
        if(this.getBulkTank() == null) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }
        
        // Milk the cow and fill the tank
        this.getBulkTank().addToTank(milkable.milk());
    }   
}
