import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // Objects
        Scanner reader = new Scanner(System.in);
        ParticipantList participantList = new ParticipantList();
        List<RoundResult> roundResults = new ArrayList<RoundResult>();
        
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        
        // References
        Map<String, int[]> jumpResults;
        String input;
        
        while(true) {
            System.out.print("  Participant name: ");
            input = reader.nextLine();
            
            // If the input is empty, begin the tournament
            if(input.equals("")) {
                break;
            }
            
            // Else instantiate new participant and add it to participantList
            participantList.addParticipant(new Participant(input));
        }
        
        System.out.println("");
        System.out.println("The tournament begins!");
        System.out.println("");
        
        // Variable to keep track of which round is it
        int round = 0;
        while(true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            input = reader.nextLine();
            
            // Check if user typed in jump, else finish the tournament
            if(!input.equalsIgnoreCase("jump")) {
                System.out.println("");
                System.out.println("Thanks!\n");
                System.out.println("Tournament results:");
                System.out.println("Position    Name");
                
                // Sort participantList from more to less points
                participantList.sortMoreToLessPoints();
                int howMany = participantList.size();
                for(int i = 0; i < howMany; i++) {
                    System.out.println((i + 1) + "           " + participantList.getParticipant(i));
                    System.out.print("            jump lengths: ");
                    
                    // Loop for lengths
                    int howManyLength = participantList.getParticipant(i).getLengths().size();
                    for(int j = 1; j <= howManyLength; j++) {
                        if(j == howManyLength) {
                            System.out.print(participantList.getParticipant((i)).getLengths().get(j - 1) + " m");
                        } else {
                            System.out.print(participantList.getParticipant((i)).getLengths().get(j - 1) + " m, ");
                        } 
                    }
                    System.out.println("");
                }
                break;
            }
            
            // Else increment the round number
            round++;
            
            // Execute the round
            System.out.println("");
            System.out.println("Round " + round);
            System.out.println("");
            System.out.println("Jumping order:");
            
            // Sort the participants from lesser points to more
            participantList.sortLessToMorePoints();
            
            // Get the size of participants
            int howMany = participantList.size();
            
            // Loop to print the jumping order
            for(int j = 0; j < howMany; j++) {
                System.out.println("  " + (j + 1) + ". " + participantList.getParticipant(j));
            }
            
            // Add empty RoundResult Object to roundResults list
            roundResults.add(new RoundResult(round));
            
            // Jump all the participants
            for(Participant p : participantList.getParticipants()) {
                
                // Store the jump results in a Map Interface
                jumpResults = p.jump();
                
                // Get the RoundResult Object from the roundResults list
                RoundResult currentRoundResults = roundResults.get(round - 1);
                
                // Get the results from jumpResults variable
                int lengthResult = jumpResults.get("length")[0];
                int[] votesResult = jumpResults.get("votes");
                int validVotesResult = currentRoundResults.calculateValidVote(votesResult);
                
                // Append results to currentRoundResults               
                currentRoundResults.addLength(p, lengthResult);
                currentRoundResults.addJudgeVote(p, votesResult);
                
                // Update Participant points and lengths
                p.updatePoints(lengthResult, validVotesResult);
                p.updateLengths(lengthResult);
            }

            // Results
            System.out.println("");
            System.out.println("Results of round " + round);
            
            for(Participant p : participantList.getParticipants()) {
                System.out.println("  " + p.getName());
                System.out.println("    length: " + roundResults.get(round - 1).getLength(p));
                System.out.println("    judge votes: " + Arrays.toString(roundResults.get(round - 1).getJudgeVote(p)));
            }
            System.out.println("");
        }
    }
}
