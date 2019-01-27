public class CivilService implements NationalService {
    
    // Attributes
    private int daysLeft;
    
    // Constructor
    public CivilService() {
        this.daysLeft = 362;
    }
    
    @Override
    public int getDaysLeft() {
        return this.daysLeft;
    }
    
    @Override
    public void work() {
        if(this.getDaysLeft() > 0) {
            int tempDaysLeft = this.getDaysLeft();
            tempDaysLeft--;
            this.daysLeft = tempDaysLeft;
        }
    }
}
