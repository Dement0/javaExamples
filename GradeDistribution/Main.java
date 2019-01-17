import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // References
        String input;
        int score = 0;
        int sumOfScores = 0;
        
        // Objects
        Grades grades = new Grades();
        
        printMenu();
        while(true) {
            input = reader.next();
            if(input.equals("-1")) {
                break;
            }
            try {
                score = Integer.parseInt(input);
                grades.addGrade(score);
            }
            catch(NumberFormatException exc) {
                System.out.println("Not a number!");
            }
        }
        
        System.out.println("Total: " + sumOfScores);
        
        System.out.println("Grade distribution:");
        for(int i = 5; i >= 0; i--) {
            grades.printGrades(i);
        }
        grades.printAcceptancePercentage();
        
    }
    
    public static void printMenu() {
        System.out.println("Type exam scores, -1 completes:");
    }
}
