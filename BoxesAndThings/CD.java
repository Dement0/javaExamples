public class CD implements ToBeStored {
    
    // Attributes
    private String artist, title;
    private int publishingYear;
    private final double weight;
    
    // Constructors
    public CD (String artist, String title, int publishingYear) {
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
        this.weight = 0.1D;
    }
    
    // Methods
    public String getArtist() {
        return this.artist;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public int getPublishingYear() {
        return this.publishingYear;
    }
    
    public double getWeight() {
        return this.weight;
    }
    
    @Override
    public double weight() {
        return 0.00;
    }
    
    // Utilities
        
}
