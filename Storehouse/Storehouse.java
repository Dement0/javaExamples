import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;

public class Storehouse {
    
    // Attributes
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;
    
    // Constructors
    public Storehouse() {
        this.prices = new HashMap<String, Integer>();
        this.stocks = new HashMap<String, Integer>();
    }
    
    // Methods
    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }
    
    public int price(String product) {
        // Returns the price of the parameter product
        if(this.prices.containsKey(product)) {
            return this.prices.get(product);
        }
        // If the storehouse doesn't contain the product, return -99
        return -99;
    }
    
    public int stock(String product) {
        // Returns the stock of the parameter product
        if(this.stocks.containsKey(product)) {
            return this.stocks.get(product);
        }
        // If the storehouse doesn't contain the product, return 0
        return 0;
    }
    
    public boolean take(String product) {
        // Decreases the stock of the parameter product by one
        // returns true if the object was available in the storehouse
        if(this.stock(product) > 0) {
            this.stocks.put(product, 0);
            return true;
        }
        return false;
    }
    
    public Set<String> products() {
        // Returns a name set of the products contained in the storehouse
        Set<String> result = new HashSet<String>();
        for(String productName : this.stocks.keySet()) {
            result.add(productName);
        }
        return result;
    }
    
    // Utilities
    @Override
    public boolean equals(Object other) {
        if(other instanceof Storehouse) {
            // Cast it to Storehouse
            Storehouse otherStorehouse = (Storehouse) other;
            return this.prices.equals(otherStorehouse.prices) && 
                   this.stocks.equals(otherStorehouse.stocks);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * Objects.hash(this.prices, this.stocks);
    }   
}
