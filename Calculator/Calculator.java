public class Calculator {

    // Attributes
    private Reader reader;
    private int statistics;
    
    // Constructors
    public Calculator() {
        reader = new Reader();
        statistics = 0;
    }
    
    // Setters & Getters
    private void setStatistic() {
        int temp = this.getStatistics();
        temp++;
        this.statistics = temp;
    } 
    
    private int getStatistics() {
        return this.statistics;
    }
    
    // Methods
    public void start() {
        while(true) {
            System.out.print("command: ");
            String command = reader.readString();
            if(command.equals("end")) {
                break;
            }
            if(command.equals("sum")) {
                sum();
            } else if(command.equals("difference")) {
                difference();
            } else if(command.equals("product")) {
                product();
            }
        }
        statistics();
    }
    
    private void sum() {
        int[] inputs = this.readUserInput();
        int value1 = inputs[0];
        int value2 = inputs[1];
        System.out.println("sum of the values " + (value1 + value2));
        this.setStatistic();
    }
    
    private void difference() {
        int[] inputs = this.readUserInput();
        int value1 = inputs[0];
        int value2 = inputs[1];
        System.out.println("difference of the values " + (value1 - value2));
        this.setStatistic();
    }
    
    private void product() {
        int[] inputs = this.readUserInput();
        int value1 = inputs[0];
        int value2 = inputs[1];
        System.out.println("product of the values " + (value1 * value2));
        this.setStatistic();
    }
    
    private void statistics() {
        System.out.println("Calculations done " + this.getStatistics());
    }
    
    // Helper
    private int[] readUserInput() {
        int[] temp = new int[2];
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.print("value2: ");
        int value2 = reader.readInteger();
        temp[0] = value1;
        temp[1] = value2;
        return temp;
    }   
}
