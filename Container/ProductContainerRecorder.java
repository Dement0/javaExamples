package containers;

public class ProductContainerRecorder extends ProductContainer{
    private ContainerHistory CH;
    
    public ProductContainerRecorder(String name, double capacity,double initialVolume) {
        super(name, capacity);
        this.CH = new ContainerHistory();
        this.CH.add(initialVolume);
        super.addToTheContainer(initialVolume);
    }
    
    public String history(){
        return this.CH.toString();
    }

    @Override
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        this.CH.add(super.getVolume());
    }

    @Override
    public double takeFromTheContainer(double amount) {
        double temp = super.takeFromTheContainer(amount);
        this.CH.add(super.getVolume());
        return temp;
    }
    
    public void printAnalysis(){
        System.out.println("Product: "+super.getName());
        System.out.println("History: "+this.history());
        System.out.println("Greatest product amount: "+this.CH.maxValue());
        System.out.println("Smallest product amount: "+this.CH.minValue());
        System.out.println("Average: "+this.CH.average());
        System.out.println("Greatest change: "+this.CH.greatestFluctuation());
        System.out.println("Variance: "+this.CH.variance());
    }
}
