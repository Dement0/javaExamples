import java.util.Comparator;

public class SortMoreToLessPoints implements Comparator<Participant> {
    @Override
    public int compare(Participant p1, Participant p2) {
        return p2.getPoints() - p1.getPoints();
    }
}
