package application;

import java.util.Random;

public class Thermometer implements Sensor {

    // Attributes
    private boolean status;
    
    // Constructor
    public Thermometer() {
        this.status = false;
    }
    
    @Override
    public boolean isOn() {
        return this.status;
    }

    @Override
    public void on() {
        this.status = true;
    }

    @Override
    public void off() {
        this.status = false;
    }

    @Override
    public int measure() {
        if(!this.isOn()) {
            throw new IllegalArgumentException("The thermometer is off.");
        }
        
        // Local variable for the degree
        int degree;
        boolean isNegative;
        
        // Produce a random number between -30 and 30
        Random random = new Random();
        degree = random.nextInt(30);
        isNegative = random.nextBoolean();
        
        // Convert degree to <0 if isNegative
        if(isNegative) {
            degree *= -1;
        }
        
        return degree;   
    }   
}
