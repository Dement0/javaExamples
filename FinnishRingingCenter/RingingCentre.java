
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {

    // Attributes
    private Map<Bird, List<String>> observationPlaces;
    
    // Constructors
    public RingingCentre() {
        this.observationPlaces = new HashMap<Bird, List<String>>();
    }
    
    // Methods
    public void observe(Bird bird, String place) {
        // records the observation and its place among the bird information
        
        // Check if bird already exists, else create it
        if(!this.observationPlaces.containsKey(bird)) {
            this.observationPlaces.put(bird, new ArrayList<String>());
        }
        
        // Add the place to the list
        this.observationPlaces.get(bird).add(place);
    }
    
    public void observations(Bird bird) {
        //  prints all the observations of the parameter bird
        
        // Local variable for observed times
        int observedTime = 0;
        
        // Check if bird already exists
        if(this.observationPlaces.containsKey(bird)) {
            for(Bird birdObserved : this.observationPlaces.keySet()) {
                if(birdObserved.equals(bird)) {
                    // Increment the observedTime
                    observedTime++;
                }
            }
        }
     
        System.out.println(bird + " observations: " + observedTime);
        
        // Check if observed time is different from 0
        if(observedTime != 0) {
            // Print the observed places
            for(Bird birdObserved : this.observationPlaces.keySet()) {
                if(birdObserved.equals(bird)) {
                    // Get the observed places list
                    List<String> observedPlaces = this.observationPlaces.get(birdObserved);
                    
                    // Loop over observed places list printing the place
                    for(String place : observedPlaces) {
                        System.out.println(place);
                    }
                }
            }
        }
    } 
}
