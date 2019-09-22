package farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive {

    // Attributes
    private Random random = new Random();
    private String name;
    private double udder;
    private double current_milk;
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"
    };
    
    // Constructors
    public Cow() {
        String temp = NAMES[random.nextInt(NAMES.length)];
        this.name = temp;
        this.udder = 15 + random.nextInt(26);
        this.current_milk = 0.0;
    }
    
    public Cow(String name) {
        this.name = name;
        this.udder = 15 + random.nextInt(26);
        this.current_milk = 0.0;
    }
    
    // Methods
    public String getName() {
        return this.name;
    }
    
    public double getCapacity() {
        return this.udder;
    }
    
    public double getAmount() {
        return this.current_milk;
    }
    
    @Override
    public String toString() {
        return (this.getName() + " " + Math.ceil(this.getAmount()) +
                "/" + Math.ceil(this.getCapacity()));
    }

    @Override
    public double milk() {
        double temp = this.getAmount();
        this.current_milk = 0.0;
        return temp;
    }

    @Override
    public void liveHour() {
        this.current_milk += 0.7 + (this.random.nextInt(13)/10);
        
        // current milk cannot be more than capacity
        if(this.getAmount() > this.getCapacity()) {
            this.current_milk = this.getCapacity();
        }
    }
}
