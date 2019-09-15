package movable;

public class Organism implements Movable {

    // Attributes
    private int x, y;
    
    // Constructor
    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // Methods
    @Override
    public String toString() {
        return ("x: " + this.x + "; y: " + this.y);
    }
    
    @Override
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }    
}
