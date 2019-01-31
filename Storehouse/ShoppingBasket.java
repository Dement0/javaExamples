import java.util.List;
import java.util.ArrayList;

public class ShoppingBasket {
    
    // Attributes
    private List<Purchase> purchases;
    
    // Constructors
    public ShoppingBasket() {
        this.purchases = new ArrayList<Purchase>();
    }
    
    // Methods
    public void add(String product, int price) {
        if(this.hasProduct(product)) {
            for(Purchase item : this.purchases) {
                if(item.getProduct().equals(product)) {
                    item.increaseAmount();
                    break;
                }
            }
        } else {
            this.purchases.add(new Purchase(product, 1, price));
        }
    }
    
    public boolean hasProduct(String product) {
        for(Purchase item : this.purchases) {
            if(item.getProduct().equals(product)) {
                return true;
            }
        }
        return false;
    }
    
    public int price() {
        int tempPrice = 0;
        for(Purchase item : purchases) {
            tempPrice += item.price();
        }
        return tempPrice;
    }
    
    public void print() {
        System.out.print(this.toString());
    }
    
    // Utilities
    @Override
    public String toString() {
        String result = "";
        for(Purchase item : this.purchases) {
            result += item.toString() + "\n";
        }
        return result;
    }   
}
