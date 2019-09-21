package containers;

import java.util.ArrayList;
import java.util.List;

public class ContainerHistory {

    // Attributes
    private List<Double> containerHistory;
    
    // Constructors
    public ContainerHistory() {
        this.containerHistory = new ArrayList<Double>();
    }
    
    // Methods
    public void add(double situation) {
        this.containerHistory.add(situation);
    }
    
    public double average() {
        if(this.containerHistory.isEmpty()) {
            return 0.0;
        }
        
        // Variable to store average
        Double average = 0.00;
        
        // Loop to add values
        for(Double temp : this.containerHistory) {
            average += temp;
        }
        
        return average / this.containerHistory.size();
    }
    
    public double greatestFluctuation() {
        if(this.containerHistory.isEmpty() || this.containerHistory.size() == 1) {
            return 0.0;
        }
        
        // Variable to hold max fluctuation
        Double max = 0.0;
        int i= 0;
        
        // Loop to calculate the fluctuation among each value
        for(Double temp : this.containerHistory) {
            // Get the next item
            Double temp1 = this.containerHistory.get(i+1);
            
            // Find the absolute value
            Double tempMax = Math.abs(temp - temp1);
            
            // If tempMax value is greater, assign it to max
            if(tempMax > max) {
                max = tempMax;
            }
            
            // Increment i for getting the next value
            i++;
            
            // Control: if reached to last item, break
            if(i >= (this.containerHistory.size() - 1)) {
                break;
            }
        }
        
        // Return max
        return max;
    }
    
    public double maxValue() {
        if(this.containerHistory.isEmpty()) {
            return 0.0;
        }

        // Assign first value as max
        Double max = this.containerHistory.get(0);
        
        // Loop to find the max value
        for(Double temp : this.containerHistory) {
            if(temp > max) {
                max = temp;
            }
        }
        
        // Return max value
        return max;
    }
    
    public double minValue() {
        if(this.containerHistory.isEmpty()) {
            return 0.0;
        }

        // Assign first value as min
        Double min = this.containerHistory.get(0);
        
        // Loop to find the min value
        for(Double temp : this.containerHistory) {
            if(temp < min) {
                min = temp;
            }
        }
        
        // Return max value
        return min;
    }
    
    public void reset() {
        this.containerHistory.removeAll(containerHistory);
    }
    
    @Override
    public String toString() {
        return this.containerHistory.toString();
    }
    
    public double variance() {
        if (this.containerHistory.isEmpty() || this.containerHistory.size() == 1) {
            return 0.0;
        }
        Double mean = this.average();
        Double temp = 0.0;
        for (Double a : this.containerHistory) {
            temp += (a - mean) * (a - mean);
        }
        return temp / (this.containerHistory.size()-1);
    }
}
