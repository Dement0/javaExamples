import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

public class Rubrica {
	private int corrente;
	private List<Contatto> dati;
	
	public Rubrica(){
		corrente = -1;
		dati = new LinkedList<>();
	}
	
	public Contatto getCorrente(){
		if(corrente != -1)
			return dati.get(corrente);
		else
			return null;		
	}

	public void inserisci(Contatto c){
		dati.add(c);
		if(corrente == -1)
			corrente = 0;
	}
	
	public void visualizzaCorrente(){
		if(corrente != -1)
			System.out.println(dati.get(corrente));
	}
	
	public void cancellaCorrente(){
		if(corrente != -1)
			dati.remove(corrente);
		if(corrente == dati.size()) // ci assicuriamo che il valore di corrente resti sempre valido
			corrente--;
	}
	
	public void modificaCorrente(Contatto c){
		if(corrente != -1)
			dati.set(corrente, c);
	}
	
	public void prossimo(){
		if(corrente < dati.size()-1)
			corrente++;
	}
	
	public void precedente(){
		if(corrente > 0)
			corrente --;
	}
	
	public void stampaAmici(){
		for(Contatto c : dati)
			c.stampaSeAmico();
	}
	
	public void stampaColleghi(){
		for(Contatto c : dati)
			c.stampaSeCollega();
	}
	
	public void stampaTutto(){
		for(Contatto c : dati)
			System.out.println(c);
	}
	
	public void cercaContatto(String nome, String cognome){
		for(Contatto c : dati){
			if(c.getNome().equals(nome) && c.getCognome().equals(cognome))
				System.out.println(c);
		}
	}
	
	public void cancellaTutto(){
		dati.clear();
	}

}
