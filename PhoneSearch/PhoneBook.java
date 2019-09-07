import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    
    // Attributes
    private Map<Contact, List<String>> phoneBook;
    
    // Constructors
    public PhoneBook() {
        this.phoneBook = new HashMap<Contact, List<String>>();
    }
    
    // Methods
    public void addNumber(Contact person, String number) {
        
        // Check if contact already exists, else create it
        if(!this.phoneBook.containsKey(person)) {
            this.phoneBook.put(person, new ArrayList<String>());
        }
        
        // Retrieve the contact and add number
        this.phoneBook.get(person).add(number);
    }
    
    public void deleteContact(Contact person) {
        
        // Check if contact exists
        if(this.phoneBook.containsKey(person)) {
            this.phoneBook.remove(person);
        }
    }
    
    public boolean containsContact(String name) {
        for(Contact c : this.phoneBook.keySet()) {
            if(c.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    
    public Contact getContactByName(String name) {
        for(Contact c : this.phoneBook.keySet()) {
            if(c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }
    
    public Contact getContactByNumber(String number) {
        for(Contact c : this.phoneBook.keySet()) {
            if(c.hasNumber(number)) {
                return c;
            }
        }
        return null;
    }
    
    public List<String> getContactNumber(String name) {
            for(Contact c : this.phoneBook.keySet()) {
            if(c.getName().equals(name)) {
                return c.getNumbers();
            }
        }
        return null;
    }
    
    public void printContactInfo(Contact person) {
        System.out.println(this.phoneBook.get(person));
    }
    
    public List<Contact> searchWithKeyword(String keyword) {
        
        List<Contact> resultList = new ArrayList<Contact>();
        if(keyword.isEmpty()) {
            
            // Add each contact to resultList
            for(Contact contact : this.phoneBook.keySet()) {
                resultList.add(contact);
            }
        } else {
            
            // Check if name or address contains the keyword
            for(Contact contact : this.phoneBook.keySet()) {
                if(contact.getName().contains(keyword) || contact.getAddress().contains(keyword)) {
                    resultList.add(contact);
                }
            }
            
            // Sort the list
            Collections.sort(resultList, new ComparatorByName());
        }
        
        return resultList;
    }
}
