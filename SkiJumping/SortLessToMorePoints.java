import java.util.Comparator;

public class SortLessToMorePoints implements Comparator<Participant> {
    @Override
    public int compare(Participant p1, Participant p2) {
        return p1.getPoints() - p2.getPoints();
    }
}
