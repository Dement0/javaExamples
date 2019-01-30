public class CD implements ToBeStored {
    
    // Attributes
    private String artist, title;
    private int publishingYear;
    private final double weight;
    
    // Constructors
    public CD() {
        this("-", "-", 0);
    }
    
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
        
    @Override
    public double weight() {
        return this.weight;
    }
    
    // Utilities
    @Override
    public String toString() {
        return this.getArtist() + ": " + this.getTitle() + " (" + 
               this.getPublishingYear() + ")";
    }
}
