public class MilitaryService implements NationalService {
    
    // Attributes
    private int daysLeft;
    
    // Constructors
    public MilitaryService(int daysLeft) {
        this.daysLeft = daysLeft;
    }
    
    // Methods
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
