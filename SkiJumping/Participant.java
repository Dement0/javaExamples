import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Participant implements Comparable<Participant> {

    // Attributes
    private String name;
    private int points;
    private List<Integer> lengths;
    private Random random;
    
    // Constructors
    public Participant() {
        this("JohnDoe");
    }
    
    public Participant(String name) {
        this.name = name;
        this.points = 0;
        this.random = new Random();
        this.lengths = new ArrayList<Integer>();
    }
    
    // Methods
    private void addPoints(int point) {
        int temp = this.getPoints();
        this.points = temp + point;
    }
    
    private void addLength(int length) {
        this.lengths.add(length);
    }
    
    public void updateLengths(int length) {
        this.addLength(length);
    }
    
    public void updatePoints(int length, int validVoteSum) {
        this.addPoints(length + validVoteSum);
    }
    
    public int getPoints() {
        return this.points;
    }
       
    public String getName() {
        return this.name;
    }
    
    public List<Integer> getLengths() {
        return this.lengths;
    }
    
    public Map<String, int[]> jump() {
        Map<String, int[]> result = new HashMap<String, int[]>();
        int low, high, lengthAsInt, voteAsInt;
        
        // Generate random number between 60 and 120 for length
        low = 60;
        high = 120;
        lengthAsInt = random.nextInt(high - low) + low;
        
        // Convert lengthAsInt to array
        int[] lengthAsArray = {lengthAsInt};
        
        // Generate random number between 10 and 20 for votes
        low = 10;
        high = 20;
        int[] votesAsArray = new int[5];
        
        for(int k = 0; k < 5; k++) {
            voteAsInt = random.nextInt(high - low) + low;
            votesAsArray[k] = voteAsInt;
        }
        
        // Push length to Map
        result.put("length", lengthAsArray);
        result.put("votes", votesAsArray);
        
        return result;
    }   
    
    // Utilities
    @Override
    public String toString() {
        return this.getName() + " (" + this.getPoints() + " points)";
    }
    
    @Override
    public int compareTo(Participant other) {
        return this.getPoints() - other.getPoints();
    }
}
