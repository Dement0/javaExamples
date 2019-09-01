package mooc.logic;

import mooc.ui.UserInterface;


/**
 *
 * @author ilker
 */
public class ApplicationLogic {
    
    // Attributes
    private final UserInterface ui;
    
    // Constructor
    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }
    
    // Methods
    public void execute(int howManyTimes) {
        for(int i=0; i<howManyTimes; i++) {
            System.out.println("The application logic works");
            ui.update();
        }
    }
}
