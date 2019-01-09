import java.util.Objects;

public class Collega extends Contatto {
    private String fax;
    
    public Collega(String nome, String cognome, String telefono, String fax){
        super(nome, cognome, telefono);
        this.fax = fax;
    }
    
    public void set(String nome, String cognome, String telefono, String fax){
        super.set(nome, cognome, telefono);
        this.fax = fax;
    }
    
    public String toString(){
        return super.toString() + " (" + fax + ")";
    }
    
    public boolean equals(Object altro){
        if(altro instanceof Collega){
            Collega altro_c = (Collega)altro;
            return (nome.equals(altro_c.nome) && cognome.equals(altro_c.cognome)  
                    && telefono.equals(altro_c.telefono) && fax.equals(altro_c.fax));  
        } 
        return false;
    }    

	public void stampaSeCollega(){
		System.out.println(this);
	}
}
