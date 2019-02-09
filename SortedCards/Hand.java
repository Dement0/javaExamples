import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Hand implements Comparable<Hand> {
    
    // Fields
    private List<Card> hand;

    // Constructors
    public Hand() {
        this.hand = new ArrayList<Card>();
    }
    
    // Methods
    public void add(Card card) {
        this.hand.add(card);
    }
    
    public void print() {
        System.out.println(this.toString());
    }
    
    public void sort() {
        Collections.sort(this.hand);
    }
    
    public void sortAgainstSuit() {
        // Sorts the hand according to the comparator SortAgainstSuitAndValue
        SortAgainstSuitAndValue suitSorter = new SortAgainstSuitAndValue();
        Collections.sort(this.hand, suitSorter );
    }   
    
    // Utilities
    @Override
    public String toString() {
        String result = "";
        for(Card card : this.hand) {
            result += card + "\n";
        }
        return result;
    }
    
    @Override
    public int compareTo(Hand other) {
        int result1 = 0;
        int result2 = 0;
        for(Card card : this.hand) {
            result1 += card.getValue();
        }
        for(Card otherCard : other.hand) {
            result2 += otherCard.getValue();
        }
        return result1 - result2;
    }
}
