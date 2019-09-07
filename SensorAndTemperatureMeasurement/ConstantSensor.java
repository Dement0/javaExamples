package application;

public class ConstantSensor implements Sensor {
    
    // Attributes
    private int number;
    
    // Constructor
    public ConstantSensor(int number) {
        this.number = number;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void on() {
        this.isOn();
    }

    @Override
    public void off() {
        this.isOn();
    }

    @Override
    public int measure() {
        return this.number;
    }   
}
