import java.util.Objects;

public class Contatto {
    protected String nome, cognome, telefono;
    
    public Contatto(String nome, String cognome, String telefono){
        set(nome, cognome, telefono);
    }
    
    public void set(String nome, String cognome, String telefono){
        this.nome = nome;
        this.cognome = cognome;
        this.telefono= telefono;
    }
    
	public String getNome(){
		return nome;
	}
	
	public String getCognome(){
		return cognome;
	}
	
    public String toString(){
        return nome + " " + cognome + " - " + telefono;
    }
    
    public boolean equals(Object altro){
        if(altro instanceof Contatto){
            Contatto altro_c = (Contatto)altro;
            return (nome.equals(altro_c.nome) && cognome.equals(altro_c.cognome)  
                    && telefono.equals(altro_c.telefono));  
        } else {
            return false;
        }
    }
    
    public int hashCode(){
        return Objects.hash(nome, cognome, telefono);
    }
	
	// metodi che verranno ridefiniti nelle sottoclassi
	public void stampaSeAmico(){}

	public void stampaSeCollega(){}

}
