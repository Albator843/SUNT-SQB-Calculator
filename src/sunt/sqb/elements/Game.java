package sunt.sqb.elements;

import java.util.HashMap;
import java.util.Map;

public class Game {
    private int id;
    private String map;
    private String teamAdverse;
    private Joueur leader_1;
    private Joueur leader_2;
    private Map<Joueur, TableStatsTypeVehicule> joueurs;

    public Game(int id, String map, String teamAdverse,Joueur leader_1, Joueur leader_2) {
        this.id = id;
        this.map = map;
        this.teamAdverse = teamAdverse;
        this.leader_1 = leader_1;
        this.leader_2 = leader_2;
        this.joueurs = new HashMap<>();
    }

    public void addJoueurStats(Joueur joueur, TableStatsTypeVehicule stats) {
        this.joueurs.put(joueur, stats);
    }

    /*
     * Retourne un résumé des statistiques de la game avec une indentation donnée, sous forme d'un String.
     */
    public String resumeStatsGame(int indentation) {
        String indent = "  ".repeat(indentation);
        String resume = indent + "Game ID: " + id + "\n";
        resume += indent + "Map: " + map + "\n";
        resume += indent + "Team Adverse: " + teamAdverse + "\n";
        resume += indent + "Leader 1: " + leader_1.pseudo() + "\n";
        resume += indent + "Leader 2: " + leader_2.pseudo() + "\n";
        resume += indent + "Joueurs Stats:\n";
        for (Map.Entry<Joueur, TableStatsTypeVehicule> entry : joueurs.entrySet()) {
            Joueur joueur = entry.getKey();
            TableStatsTypeVehicule stats = entry.getValue();
            resume += indent + "  Joueur: " + joueur.pseudo() + "\n";
            resume += stats.resumeStats(indentation + 2);
        }
        return resume;
    }
}
