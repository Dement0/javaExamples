public class Sculpture extends Artwork {

	// Attributes
	private String material, height;
	
	
	// Constructors
	public Sculpture() {
		this("-", "-");
	}
	
	public Sculpture(String material, String height) {
		super();
		this.material = material;
		this.height = height;
	}
	
	public Sculpture(String title, String author, String creationDate, String material, String height) {
		super(title, author, creationDate);
		this.material = material;
		this.height = height;
	}
	
	
	// Setters & Getters
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void setHeight(String height) {
		this.height = height;
	}
	
	public String getMaterial() {
		return this.material;
	}
	
	public String getHeight() {
		return this.height;
	}
	
	
	// Methods
	@Override
	public void printIfSculpture() {
		System.out.println(this);
	}
	
	
	// Utilities
	@Override
	public String toString() {
		return super.toString() + ", Material: " + this.getMaterial() + ", Height: " + this.getHeight();
	}
}
