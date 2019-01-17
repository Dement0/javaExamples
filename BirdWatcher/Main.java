
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // References
        String input, name, latinName;

        // Objects
        Scanner reader = new Scanner(System.in);
        BirdDatabase db = new BirdDatabase();

        while (true) {
            System.out.print("? ");
            input = reader.next();

            if (input.equals("Add")) {
                System.out.print("Name: ");
                name = reader.next();
                System.out.print("Latin name: ");
                latinName = reader.next();
                db.add(new Bird(name, latinName));
                //break;
            } else if (input.equals("Observation")) {
                System.out.print("What was observed:? ");
                name = reader.next();
                if (db.hasBird(name)) {
                    db.observe(name);
                } else {
                    System.out.println("Is not a bird!");
                }
                //break;
            } else if (input.equals("Statistics")) {
                db.printStats();
                //break;
            } else if (input.equals("Show")) {
                System.out.print("What? ");
                name = reader.next();
                db.show(name);
                //break;
            } else if (input.equals("Quit")) {
                return;
            } else {
                System.out.println("Not a valid command.");
            }
        }
    }
}
