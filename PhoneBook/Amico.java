public class Amico extends Contatto {
    private String indirizzo;
    
    public Amico(String nome, String cognome, String telefono, String indirizzo){
        super(nome, cognome, telefono);
        this.indirizzo = indirizzo;
    }
    
    public void set(String nome, String cognome, String telefono, String indirizzo){
        super.set(nome, cognome, telefono);
        this.indirizzo = indirizzo;
    }
    
    public String toString(){
        return super.toString() + " - " + indirizzo;
    }
    
    public boolean equals(Object altro){
        if(altro instanceof Amico){
            Amico altro_a = (Amico)altro;
            return (nome.equals(altro_a.nome) && cognome.equals(altro_a.cognome)  
                    && telefono.equals(altro_a.telefono) && indirizzo.equals(altro_a.indirizzo));  
        } 
        return false;
    }
	
	public void stampaSeAmico(){
		System.out.println(this);
	}
	
}
