import java.util.List;
import java.util.ArrayList;

public class Changer {

    // Attributes
    private List<Change> changes;
    
    // Constructors
    public Changer() {
        this.changes = new ArrayList<Change>();
    }
    
    // Methods
    public void addChange(Change change) {
        this.changes.add(change);
    }
    
    public String change(String characterString) {
        String result = characterString;
        for(Change change : changes) {
            result = change.change(result);
        }
        return result;
    }
}
