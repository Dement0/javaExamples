import java.util.Scanner;

public class MuseumManager {
	
	public static void main(String[] args) {
	
		// References
		Museum museum;
		Artwork artwork1;
		Artwork sculpture1;
		Artwork painting1;
		Scanner reader;
		String input, name, author, creationDate, material, height, technique, dimensions, query;
		
		// Objects
		reader = new Scanner(System.in);
		museum = new Museum("Palermo Museum");


		// Start the program
		while(true) {
			printMenu();
			input = reader.next();
			switch(input) {
				case "1": System.out.print("Artwork name: ");
						  name = reader.next();
						  System.out.print("Artwork author: ");
						  author = reader.next();
						  System.out.print("Artwork creation date: ");
						  creationDate = reader.next();
						  try {
						  	museum.insertArt(new Artwork(name, author, creationDate));
						  	System.out.println("Successfully inserted the artwork.");
						  }
						  catch(Exception exc) {
						  	System.out.println("Can't insert artwork.");
						  	exc.printStackTrace();
						  }
					break;
				case "2": System.out.print("Sculpture name: ");
						  name = reader.next();
						  System.out.print("Sculpture author: ");
						  author = reader.next();
						  System.out.print("Sculpture creation date: ");
						  creationDate = reader.next();
						  System.out.print("Material: ");
						  material = reader.next();
						  System.out.print("Height: ");
						  height = reader.next();
						  try {
						  	museum.insertArt(new Sculpture(name, author, creationDate, material, height));
						  	System.out.println("Successfully inserted the sculpture.");
						  }
						  catch(Exception exc) {
						  	System.out.println("Can't insert sculpture.");
						  	exc.printStackTrace();
						  }
					break;
				case "3": System.out.print("Painting name: ");
						  name = reader.next();
						  System.out.print("Painting author: ");
						  author = reader.next();
						  System.out.print("Painting creation date: ");
						  creationDate = reader.next();
						  System.out.print("Technique: ");
						  technique = reader.next();
						  System.out.print("Dimensions: ");
						  dimensions = reader.next();
						  try {
						  	museum.insertArt(new Painting(name, author, creationDate, technique, dimensions));
						  	System.out.println("Successfully inserted the painting.");
						  }
						  catch(Exception exc) {
						  	System.out.println("Can't insert painting.");
						  	exc.printStackTrace();
						  }
					break;
				case "4": try {
							museum.printSculptures();
						  }
						  catch(Exception exc) {
						  	System.out.println("Can't print sculptures.");
						  	exc.printStackTrace();
						  }
					break;
				case "5": try {
							museum.printPaintings();
						  }
						  catch(Exception exc) {
						  	System.out.println("Can't print paintings.");
						  	exc.printStackTrace();
						  }
					break;
				case "6": try {
							museum.printArts();
						  }
						  catch(Exception exc) {
						  	System.out.println("Can't print artwork.");
						  	exc.printStackTrace();
						  }
					break;
				case "7": if(museum.getArtsNumber() != 0) {
							  System.out.print("Artwork title: ");
							  query = reader.next();
							  if(query.isEmpty()) {
							  	break;
							  }
							  Artwork artworkToDelete = museum.searchArtByName(query);
							  // Check if null
							  if(artworkToDelete != null) {
							  	museum.deleteArt(artworkToDelete);
							  }
							  else {
							  	System.out.println("Can't delete the artwork.");
							  }
						  }
						  else {
						  	System.out.println("No artwork to delete.");
						  }
					break;
				case "8": return;
				default: System.out.println("Invalid operation.");
			}
		}		

	}
	
	public static void printMenu() {
		System.out.println("Please enter the corresponding number for the operation:");
		System.out.println("1. Insert a new artwork");
		System.out.println("2. Insert a new sculpture");
		System.out.println("3. Insert a new painting");
		System.out.println("4. Print all sculptures");
		System.out.println("5. Print all paintings");
		System.out.println("6. Print all artwork");
		System.out.println("7. Delete an artwork");
		System.out.println("8. Exit");
		System.out.print("> ");
	}
}
