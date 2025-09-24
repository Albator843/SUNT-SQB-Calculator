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
}
