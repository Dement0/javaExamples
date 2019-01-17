// Represents grades of exam scores

import java.util.List;
import java.util.ArrayList;

public class Grades {

    // Attributes
    private int totalGrades;
    private List<Integer> grades;
    
    // Constructors
    public Grades() {
        setTotalGrades(0);
        grades = new ArrayList<Integer>();
    }
    
    // Setters & Getters
    public void setTotalGrades(int amount) {
        this.totalGrades = amount;
    }
    
    public int getTotalGrades() {
        return this.totalGrades;
    }
    
    // Methods    
    public void addGrade(int score) {
        if(0 <= score && score <= 60) {
            this.grades.add(this.getScoreAsGrade(score));
            this.setTotalGrades(this.getTotalGrades() + 1);
        }
    }
    
    public int getScoreAsGrade(int score) {
        if(0 <= score && score < 30) {
            return 0;
        }
        else if(30 <= score && score < 35) {
            return 1;
        }
        else if(35 <= score && score < 40) {
            return 2;
        }
        else if(40 <= score && score <45) {
            return 3;
        }
        else if(45 <= score && score < 50) {
            return 4;
        }
        else if(50 <= score && score <= 60) {
            return 5;
        }
        else {
            return -1;
        }
    }
    
    public void printGrades(int grade) {
        String result = "";
        if(!(this.grades.isEmpty())) {
            for(Integer g : grades) {
                if(g.equals(grade)) {
                    result += "*";
                }
            }
        }
        System.out.println(grade + ": " + result);
    }
    
    public void printAcceptancePercentage() {
        int acceptedGrades = 0;
        double acceptancePercentage = 0.00D;
        for(Integer grade : grades) {
            if(!(grade.equals(0))) {
                acceptedGrades++;
            }
        }
        acceptancePercentage = (double)acceptedGrades * 100 / this.getTotalGrades();
        System.out.println("Acceptance percentage: " + acceptancePercentage);
    }
    
    // Utilities
    @Override
    public String toString() {
        return "Total grades: " + this.getTotalGrades();
    }
}
