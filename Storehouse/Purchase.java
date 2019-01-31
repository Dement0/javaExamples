public class Purchase {

    // Attributes
    private String product;
    private int amount, unitPrice;
    
    // Constructors
    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }
    
    // Methods
    public String getProduct() {
        return this.product;
    }
    
    public int getAmount() {
        return this.amount;
    }
    
    public int getUnitPrice() {
        return this.unitPrice;
    }
    
    public int price() {
        return this.getAmount() * this.getUnitPrice();
    }
    
    public void increaseAmount() {
        this.amount++;
    }
    
    // Utilities
    @Override
    public String toString() {
        return this.getProduct() + ": " + this.getAmount();
    }
}
