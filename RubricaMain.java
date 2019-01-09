import java.util.Scanner;

public class RubricaMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input, nome, cognome, indirizzo, telefono, fax;
        Rubrica r = new Rubrica();
        
        while(true){
            stampaMenu();
            input = sc.next();
            switch(input){
                case "a":
					System.out.print("Inserisci nome: ");
					nome = sc.next();
					System.out.print("Inserisci cognome: ");
					cognome = sc.next();
					System.out.print("Inserisci telefono: ");
					telefono = sc.next();
					System.out.print("Inserisci indirizzo: ");
					indirizzo = sc.next();
                    r.inserisci(new Amico(nome, cognome, telefono, indirizzo));
                    break;

                case "b":
					System.out.print("Inserisci nome: ");
					nome = sc.next();
					System.out.print("Inserisci cognome: ");
					cognome = sc.next();
					System.out.print("Inserisci telefono: ");
					telefono = sc.next();
					System.out.print("Inserisci fax: ");
					fax = sc.next();
                    r.inserisci(new Collega(nome, cognome, telefono, fax));
                    break;

                case "c":
                    r.visualizzaCorrente();
                    break;

                case "d":
                    r.cancellaCorrente();
                    break;

                case "e":
					Contatto c = r.getCorrente();
					if(c == null)
						break;
		
					System.out.println("Contatto corrente:");
					r.visualizzaCorrente();		
					System.out.print("Inserisci nuovo nome: ");
					nome = sc.next();		
					System.out.print("Inserisci nuovo cognome: ");
					cognome = sc.next();
					System.out.print("Inserisci nuovo telefono: ");
					telefono = sc.next();
					
					if(c instanceof Amico){
						System.out.print("Inserisci nuovo indirizzo: ");
						indirizzo = sc.next();		
						r.modificaCorrente(new Amico(nome, cognome, telefono, indirizzo));
					}	
					if(c instanceof Collega){
						System.out.print("Inserisci nuovo fax: ");
						fax = sc.next();		
						r.modificaCorrente(new Amico(nome, cognome, telefono, fax));
					}	
                    break;
                
				case "f":
                    r.prossimo();
                    r.visualizzaCorrente();
                    break;
                
				case "g":
                    r.precedente();
                    r.visualizzaCorrente();
                    break;
                
				case "h":
                    r.stampaAmici();
                    break;
                
				case "i":
                    r.stampaColleghi();
                    break;
                
				case "j":
                    r.stampaTutto();
                    break;
                
				case "k":
					System.out.print("Inserisci nome: ");
					nome = sc.next();
					System.out.print("Inserisci cognome: ");
					cognome = sc.next();
					
                    r.cercaContatto(nome, cognome);
                    break;
                
				case "l":
                    r.cancellaTutto();
                    break;
                
				case "m":
                    return;
                
				default:
                    System.out.println("Scelta non valida!");
                
            }
        }
    }
    
    private static void stampaMenu(){
        System.out.println("-------------------------------------");
        System.out.println("a) inserisci un nuovo amico");
        System.out.println("b) inserisci un nuovo collega");
        System.out.println("c) visualizza contatto corrente");
        System.out.println("d) cancella contatto corrente");
        System.out.println("e) modifica contatto corrente");
        System.out.println("f) vai al prossimo");
        System.out.println("g) vai al precedente");
        System.out.println("h) stampa lista degli amici");
        System.out.println("i) stampa lista dei colleghi");
        System.out.println("j) stampa lista dei contatti");
        System.out.println("k) ricerca del numero telefonico del contatto a partire dal cognome e nome");
        System.out.println("l) cancella tutto");
        System.out.println("m) esci");
        System.out.print("> ");
    }
    
}
