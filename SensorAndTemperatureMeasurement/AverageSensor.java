package application;

import java.util.List;
import java.util.ArrayList;

public class AverageSensor implements Sensor {
    
    // Attributes
    private List<Sensor> sensorList;
    private List<Integer> readingsList;
    
    // Constructor
    public AverageSensor() {
        this.sensorList = new ArrayList<Sensor>();
        this.readingsList = new ArrayList<Integer>();
    }

    @Override
    public boolean isOn() {
        for(Sensor sensor : sensorList) {
            if(!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for(Sensor sensor : sensorList) {
            sensor.on();
        }
    }

    @Override
    public void off() {
        for(Sensor sensor : sensorList) {
            if(sensor.isOn()) {
                sensor.off();
            }
        }
    }

    @Override
    public int measure() {
        
        if(!this.isOn() || this.sensorList.isEmpty()) {
            throw new IllegalArgumentException("No sensor or sensors are off.");
        }
        
        // Local variable for the degree
        int degree = 0;
        int count = 0;
        int average = 0;
        
        for(Sensor sensor : sensorList) {
            degree += sensor.measure();
            count++;
        }
        
        average = degree / count;
        this.readingsList.add(average);
        
        return average;
    }
    
    public void addSensor(Sensor additional) {
        this.sensorList.add(additional);
    }
    
    public List<Integer> readings() {
        return this.readingsList;
    }
}
