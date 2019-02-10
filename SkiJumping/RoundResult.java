import java.util.Map;
import java.util.HashMap;

public class RoundResult {

    // Attributes
    private int roundNumber;
    private Map<Participant, Integer> lengths;
    private Map<Participant, int[]> judgeVotes;
    
    // Constructors
    public RoundResult(int roundNumber) {
        this.roundNumber = roundNumber;
        this.lengths = new HashMap<Participant, Integer>();
        this.judgeVotes = new HashMap<Participant, int[]>();
    }
    
    // Methods
    public int getRoundNumber() {
        return this.roundNumber;
    }
    
    public void addLength(Participant participant, Integer length) {
        this.lengths.put(participant, length);
    }
    
    public int getLength(Participant participant) {
        return this.lengths.get(participant);
    }
    
    
    public Map getLengths() {

        // Returns an HashMap of lengths for each participant
        Map<Participant, Integer> result = new HashMap<Participant, Integer>();
        for(Participant p : this.lengths.keySet()) {
            result.put(p, this.lengths.get(p));
        }
        return result;
    }
    
    public void addJudgeVote(Participant participant, int[] votes) {
        this.judgeVotes.put(participant, votes);
    }
    
    public int[] getJudgeVote(Participant participant) {
        return this.judgeVotes.get(participant);
    }
    
    public Map getJudgeVotes() {

        // Returns an HashMap of judgeVotes for each participant
        Map<Participant, int[]> result = new HashMap<Participant, int[]>();
        for(Participant p : this.lengths.keySet()) {
            result.put(p, this.judgeVotes.get(p));
        }
        return result;
    }    
    
    public int calculateValidVote(int[] votes) {
        int min = votes[0];
        int max = votes[0];
        int length = votes.length;
        int sum = 0;
        
        // Loop
        for(int i = 0; i < length; i++) {
            if(votes[i] < min) {
                min = votes[i];
            }
            if(votes[i] > max) {
                max = votes[i];
            }
            sum += votes[i];
        }
        
        // Sum valid votes subtracting min and max
        sum -= (min + max);

        return sum;
    }
}
