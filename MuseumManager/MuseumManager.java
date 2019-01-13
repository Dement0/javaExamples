public class MuseumManager {
	
	public static void main(String[] args) {
	
		// References
		Museum museum1;
		Artwork artwork1;
		Artwork sculpture1;
		Artwork painting1;
		
		// Objects
		museum1 = new Museum("Palermo Museum");
		artwork1 = new Artwork("My First Artwork", "Ilker", "01.01.1971");
		sculpture1 = new Sculpture("My First Sculpture", "Mario", "20.10.1776", "marble", "178 cm");
		painting1 = new Painting("My First Painting", "John", "31.12.2018", "china", "150x200 cm");
		
		// Add art to museum
		museum1.insertArt(artwork1);
		museum1.insertArt(sculpture1);
		museum1.insertArt(painting1);
		
		// Print
		museum1.printSculptures();
		museum1.printPaintings();
		museum1.printArts();
		System.out.println(museum1);
		
		// Delete art
		museum1.deleteArt(artwork1);

		museum1.printArts();
		System.out.println(museum1);
		
		museum1.deleteArt(sculpture1);
		
		museum1.printArts();
		System.out.println(museum1);
		
		museum1.deleteArt(painting1);
		
		museum1.printArts();
		System.out.println(museum1);
	}
}
