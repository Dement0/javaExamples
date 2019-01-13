public class Artwork {

	// Attributes
	private String title, author, creationDate;
	
	
	// Constructors
	public Artwork() {
		this("-", "-", "-");
	}
	
	public Artwork(String title, String author, String creationDate) {
		this.title = title;
		this.author = author;
		this.creationDate = creationDate;
	}
	
	
	// Setters & Getters
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setCreationDate(String date) {
		this.creationDate = creationDate;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getCreationDate() {
		return this.creationDate;
	}
	
	
	// Methods to be redefined in child classes
	public void printIfSculpture() {}
	
	public void printIfPainting() {}
	
	
	// Utilities
	@Override
	public String toString() {
		return "Title: " + this.getTitle() + ", Author: " + this.getAuthor() + ", Date: " + this.getCreationDate();
	}
	
	@Override
	public boolean equals(Object other) {
		if(other instanceof Artwork) {
			// Cast it to Artwork
			Artwork otherArtwork = (Artwork) other;
			return (this.getTitle() == otherArtwork.getTitle() && this.getAuthor() == otherArtwork.getAuthor() && this.getCreationDate() == otherArtwork.getCreationDate());
		}
		return false;
	}
}
