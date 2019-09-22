package farmsimulator;

import java.util.ArrayList;
import java.util.List;

public class Farm implements Alive {

    // Attributes
    private String owner;
    private Barn barn;
    private List<Cow> cows;
    
    // Constructors
    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }
    
    // Methods
    public void addCow(Cow cow) {
        this.cows.add(cow);
    }
    
    public String getOwner() {
        return this.owner;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.barn.installMilkingRobot(milkingRobot);
    }
    
    public void manageCows() {
        this.barn.takeCareOf(cows);
    }
    
    @Override
    public void liveHour() {
        for(Cow cow : cows) {
            cow.liveHour();
        }
    }
    
    @Override
    public String toString() {
        String result = "Farm owner: " + this.getOwner() + "\n";
        result += "Barn bulk tank: " + this.barn + "\n";
        if(this.cows.isEmpty()) {
            result += "No cows.";
        } else {
            result += "Animals: + \n";
            for(Cow cow : cows) {
                result += "        " + cow;
            }
        }
        return result;
    }
}
