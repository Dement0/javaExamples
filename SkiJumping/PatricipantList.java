import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ParticipantList implements Comparable<ParticipantList> {
    
    // Attributes
    private List<Participant> participantList;
    
    // Constructors
    public ParticipantList() {
        this.participantList = new ArrayList<Participant>();
    }
    
    // Methods
    public void addParticipant(Participant participant) {
        this.participantList.add(participant);
    }
    
    public Participant getParticipant(int index) {
        return this.participantList.get(index);
    }
    
    public List<Participant> getParticipants() {
        return this.participantList;
    }
    
    public int size() {
        return this.participantList.size();
    }
    
    public void sortLessToMorePoints() {
        Collections.sort(this.participantList, new SortLessToMorePoints());
    }
    
    public void sortMoreToLessPoints() {
        Collections.sort(this.participantList, new SortMoreToLessPoints());
    }
    
    // Utilities
    @Override
    public String toString() {
        String result = "Participants\n";
        for(Participant p : this.participantList) {
            result += p + "\n";
        }
        return result;
    }
    
    @Override
    public int compareTo(ParticipantList other) {
        int result1 = 0;
        int result2 = 0;
        
        for(Participant p : this.participantList) {
            result1 += p.getPoints();
        }
        
        for(Participant p : other.participantList) {
            result2 += p.getPoints();
        }
                
        return result1 - result2;
    }
}
