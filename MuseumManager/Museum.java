import java.util.List;
import java.util.ArrayList;

public class Museum {

	// Attributes
	private String museumName;
	private List<Artwork> arts;
	
	
	// Constructors
	public Museum() {
		this("-");
	}
	
	public Museum(String name) {
		setMuseumName(name);
		arts = new ArrayList<>();
	}
	
	
	// Setters & Getters
	public void setMuseumName(String museumName) {
		this.museumName = museumName;
	}

	public String getMuseumName() {
		return this.museumName;
	}
	
	public int getArtsNumber() {
		return this.arts.size();
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
	
	public void insertArt(Artwork art) {
		arts.add(art);
	}	
	
	public boolean deleteArt(Artwork artToDelete) {
		// ArrayList to add the Artwork to be deleted
		//https://stackoverflow.com/questions/8104692/how-to-avoid-java-util-concurrentmodificationexception-when-iterating-through-an
		boolean canDelete = false;
		List<Artwork> newArtsList = new ArrayList<>();
		for(Artwork art : arts) {
			if(art.equals(artToDelete)) {
				newArtsList.add(art);
				canDelete = true;
			}
		}
		if(canDelete) {
			arts.removeAll(newArtsList);
			System.out.println("Deleted successfully.");
		}
		newArtsList = null;
		return canDelete;
	}
	
	public Artwork searchArtByName(String title) {
		if(!title.isEmpty()) {
			// Search with a for loop
			for(Artwork art : arts) {
				if(art.getTitle().equals(title)) {
					return art;
				}
			}
		}
		return null;
	}

	
	// Utilities
	@Override
	public String toString() {
		return this.getMuseumName() + ", has " + this.getArtsNumber() + " arts.";
	}
}
