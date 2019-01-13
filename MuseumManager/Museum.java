import java.util.List;
import java.util.ArrayList;

public class Museum {

	// Attributes
	private List<Artwork> arts;
	
	// Constructors
	public Museum() {
		arts = new ArrayList<>();
	}
	
	// Methods
	public void printSculptures() {
		for(Artwork art : arts) {
			art.printIfSculpture();
		}
	}
	
	public void printPaintings() {
		for(Artwork art : arts) {
			art.printIfPainting();
		}
	}
	
	public void printArts() {
		for(Artwork art : arts) {
			System.out.println(art);
		}		
	}
	

	
}
