package sunt.sqb.elements;

import java.util.ArrayList;
import java.util.List;

public class Joueur {
    private String pseudo;
    private List<Integer> scores;
    private List<Integer> killsAir;
    private List<Integer> killsSol;
    private List<Integer> assistances;
    private List<Integer> captures;
    private List<Integer> morts;

    public Joueur(String pseudo){
        
        this.pseudo = pseudo;

        this.scores = new ArrayList<>();
        this.killsAir = new ArrayList<>();
        this.killsSol = new ArrayList<>();
        this.assistances = new ArrayList<>();
        this.captures = new ArrayList<>();
        this.morts = new ArrayList<>();
    }

    public int totalScore() {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return total;
    }

    public int totalKillsAir() {
        int total = 0;
        for (int kill : killsAir) {
            total += kill;
        }
        return total;
    }

    public int totalKillsSol() {
        int total = 0;
        for (int kill : killsSol) {
            total += kill;
        }
        return total;
    }

    public int totalAssistances() {
        int total = 0;
        for (int assistance : assistances) {
            total += assistance;
        }
        return total;
    }

    public int totalCaptures() {
        int total = 0;
        for (int capture : captures) {
            total += capture;
        }
        return total;
    }

    public int totalMorts() {
        int total = 0;
        for (int mort : morts) {
            total += mort;
        }
        return total;
    }

    public String resumePartie(int indentation) {
        String indent = "  ".repeat(indentation);
        String resume = pseudo + ":\n"
                + indent + "Total Score: " + totalScore() + "\n"
                + indent + "Total Kills Air: " + totalKillsAir() + "\n"
                + indent + "Total Kills Sol: " + totalKillsSol() + "\n"
                + indent + "Total Assistances: " + totalAssistances() + "\n"
                + indent + "Total Captures: " + totalCaptures() + "\n"
                + indent + "Total Morts: " + totalMorts() + "\n"; 
        
        return resume;
    }

    public void addGameStats(Game game) {
        
    }
}
