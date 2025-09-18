package sunt.sqb.elements;

import java.util.List;

/*
 * Classe représentant un joueur avec ses statistiques par type de véhicule.
 * 
 * Les statistiques sont des listes d'entiers, chaque liste correspondant à un type de véhicule.
 * Les types de véhicules sont définis dans l'énumération TypeVehicule.
 * 
 */
public class Joueur {
    private String pseudo;
    private TableStatsTypeVehicule statsMBT;
    private TableStatsTypeVehicule statsAA;
    private TableStatsTypeVehicule statsDrone;
    private TableStatsTypeVehicule statsChasseur;
    private TableStatsTypeVehicule statsBombardier;
    private TableStatsTypeVehicule statsHelico;

    public Joueur(String pseudo){
        
        this.pseudo = pseudo;

        this.statsMBT = new TableStatsTypeVehicule(TypeVehicule.MBT);
        this.statsAA = new TableStatsTypeVehicule(TypeVehicule.AA);
        this.statsDrone = new TableStatsTypeVehicule(TypeVehicule.DRONE);
        this.statsChasseur = new TableStatsTypeVehicule(TypeVehicule.CHASSEUR);
        this.statsBombardier = new TableStatsTypeVehicule(TypeVehicule.BOMBARDIER);
        this.statsHelico = new TableStatsTypeVehicule(TypeVehicule.HELICO);
    }

    public String resumePartie(int indentation) {
        String indent = "  ".repeat(indentation);
        String resume = pseudo + ":\n"; 
        
        return resume;
    }

    public void addGameStats(TypeVehicule typeVehicule, List<Integer> stats) {
        switch (typeVehicule) {
            case MBT:
                statsMBT.addStats(stats.get(0), stats.get(1), stats.get(2), stats.get(3), stats.get(4), stats.get(5));
                break;
            case AA:
                statsAA.addStats(stats.get(0), stats.get(1), stats.get(2), stats.get(3), stats.get(4), stats.get(5));
                break;
            case DRONE:
                statsDrone.addStats(stats.get(0), stats.get(1), stats.get(2), stats.get(3), stats.get(4), stats.get(5));
                break;
            case CHASSEUR:
                statsChasseur.addStats(stats.get(0), stats.get(1), stats.get(2), stats.get(3), stats.get(4), stats.get(5));
                break;
            case BOMBARDIER:
                statsBombardier.addStats(stats.get(0), stats.get(1), stats.get(2), stats.get(3), stats.get(4), stats.get(5));
                break;
            case HELICO:
                statsHelico.addStats(stats.get(0), stats.get(1), stats.get(2), stats.get(3), stats.get(4), stats.get(5));
                break;
        }
    }
}
