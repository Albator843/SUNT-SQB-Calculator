package sunt.sqb.elements;

import java.util.List;

public class Game {
    private int id;
    private String map;
    private String teamAdverse;
    private Config config;
    private Joueur leader_1;
    private Joueur leader_2;
    private List<Joueur> joueurs;

    public Game(int id, String map, String teamAdverse, Config config, Joueur leader_1, Joueur leader_2, List<Joueur> joueurs) {
        this.id = id;
        this.map = map;
        this.teamAdverse = teamAdverse;
        this.config = config;
        this.leader_1 = leader_1;
        this.leader_2 = leader_2;
        this.joueurs = joueurs;
    }

    /* 
     * Remplacer la liste de joueurs par une Map <Joueur, TableStatsTypeVehicule> ?
     */
}
