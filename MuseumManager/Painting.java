public class Painting extends Artwork {

	// Attributes
	private String technique, dimensions;
	
	
	// Constructors
	public Painting() {
		this("-", "-");
	}
	
	public Painting(String technique, String dimensions) {
		super();
		this.technique = technique;
		this.dimensions = dimensions;
	}
	
	public Painting(String title, String author, String creationDate, String technique, String dimensions) {
		super(title, author, creationDate);
		this.technique = technique;
		this.dimensions = dimensions;
	}
	
	
	// Setters & Getters
	public void setTechnique(String technique) {
		this.technique = technique;
	}
	
	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}
	
	public String getTechnique() {
		return this.technique;
	}
	
	public String getDimensions() {
		return this.dimensions;
	}
	
	
	// Methods
	@Override
	public void printIfPainting() {
		System.out.println(this);
	}
	
	
	// Utilities
	@Override
	public String toString() {
		return super.toString() + ", Technique: " + this.getTechnique() + ", Dimensions: " + this.getDimensions();
	}
	
		@Override
	public boolean equals(Object other) {
		if(other instanceof Painting) {
			// Cast it to Painting
			Painting otherPainting = (Painting) other;
			return (this.getTitle() == otherPainting.getTitle() && this.getAuthor() == otherPainting.getAuthor() && this.getCreationDate() == otherPainting.getCreationDate() &&  this.getTechnique() == otherPainting.getTechnique() && this.getDimensions() == otherPainting.getDimensions());
		}
		return false;
	}
}
