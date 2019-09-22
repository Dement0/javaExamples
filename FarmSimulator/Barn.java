package farmsimulator;

import java.util.Collection;

public class Barn {

    // Attributes
    private BulkTank bulk_tank;
    private MilkingRobot milking_robot;
    
    // Constructors
    public Barn(BulkTank tank) {
        this.bulk_tank = tank;
        this.milking_robot = null;
    }
    
    // Methods
    public BulkTank getBulkTank() {
        return this.bulk_tank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot) {
        // Initialize the milkingRobot
        this.milking_robot = milkingRobot;
        
        // Associate the tank with the milkingRobot
        this.milking_robot.setBulkTank(this.getBulkTank());
    }
    
    public void takeCareOf(Cow cow) throws IllegalStateException {
        // If no MilkingRobot has been connected to Barn, throw exception
        if(this.milking_robot == null) {
            throw new IllegalStateException();
        }
        
        // Else, milk the parameter cow via the milking robot
        this.milking_robot.milk(cow);
    }
    
    public void takeCareOf(Collection<Cow> cows) throws IllegalStateException {
        // If no MilkingRobot has been connected to Barn, throw exception
        if(this.milking_robot == null) {
            throw new IllegalStateException();
        }
        
        // Else, milk the cows via the milking robot
        for(Cow cow : cows) {
            this.takeCareOf(cow);
        }
    }
    
    @Override
    public String toString() {
        return (this.getBulkTank().toString());
    }
}
