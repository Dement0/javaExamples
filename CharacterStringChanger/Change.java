public class Change {

    // Attributes
    private char fromCharacter, toCharacter;
    
    // Constructors
    public Change() {
        this(' ', ' ');
    }
    
    public Change(char fromCharacter, char toCharacter) {
        setFromCharacter(fromCharacter);
        setToCharacter(toCharacter);
    }
    
    // Setters & Getters
    private void setFromCharacter(char fromCharacter) {
        this.fromCharacter = fromCharacter;
    }
    
    public char getFromCharacter() {
        return this.fromCharacter;
    }
    
    private void setToCharacter(char toCharacter) {
        this.toCharacter = toCharacter;
    }
    
    public char getToCharacter() {
        return this.toCharacter;
    }
    
    // Methods
    public String change(String characterString) {
        String result;
        result = characterString.replace(this.getFromCharacter(), this.getToCharacter());
        return result;
    }
}
