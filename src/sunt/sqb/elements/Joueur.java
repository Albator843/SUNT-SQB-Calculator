package sunt.sqb.elements;

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

    /*
     * Constructeur de Joueur
     */
    public Joueur(String pseudo){
        
        this.pseudo = pseudo;

        this.statsMBT = new TableStatsTypeVehicule(TypeVehicule.MBT);
        this.statsAA = new TableStatsTypeVehicule(TypeVehicule.AA);
        this.statsDrone = new TableStatsTypeVehicule(TypeVehicule.DRONE);
        this.statsChasseur = new TableStatsTypeVehicule(TypeVehicule.CHASSEUR);
        this.statsBombardier = new TableStatsTypeVehicule(TypeVehicule.BOMBARDIER);
        this.statsHelico = new TableStatsTypeVehicule(TypeVehicule.HELICO);
    }

    /*
     * Retourne le pseudo du joueur
     */
    public String pseudo() {
        return pseudo;
    }

    /*
     * Retourne les stats MBT du joueur
     */
    public TableStatsTypeVehicule statsMBT() {
        return statsMBT;
    }

    /*
     * Retourne les stats AA du joueur
     */
    public TableStatsTypeVehicule statsAA() {
        return statsAA;
    }

    /*
     * Retourne les stats Drone du joueur
     */
    public TableStatsTypeVehicule statsDrone() {
        return statsDrone;
    }

    /*
     * Retourne les stats Chasseur du joueur
     */
    public TableStatsTypeVehicule statsChasseur() {
        return statsChasseur;
    }

    /*
     * Retourne les stats Bombardier du joueur
     */
    public TableStatsTypeVehicule statsBombardier() {
        return statsBombardier;
    }

    /*
     * Retourne les stats Hélico du joueur
     */
    public TableStatsTypeVehicule statsHelico() {
        return statsHelico;
    }

    /*
     * Donne un résumé des stats du joueur, sous forme d'un String.
     */
    public String resumeStatsJoueur(int indentation) {
        String indent = "  ".repeat(indentation);
        String resume = pseudo + ":\n"; 
        resume += "Stats MBT : \n" + statsMBT.resumeStats(indentation*2);
        resume += "Stats AA : \n" + statsAA.resumeStats(indentation*2);
        resume += "Stats Drone : \n" + statsDrone.resumeStats(indentation*2);
        resume += "Stats Chasseur : \n" + statsChasseur.resumeStats(indentation*2);
        resume += "Stats Bombardier : \n" + statsBombardier.resumeStats(indentation*2);
        resume += "Stats Hélico : \n" + statsHelico.resumeStats(indentation*2);
        return resume;
    }

    /*
     * Ajoute les statistiques d'une partie à celles du joueur, en fonction du type de véhicule utilisé.
     */
    public void addGameStats(TableStatsTypeVehicule gameStats) {
        switch (gameStats.getTypeVehicule()) {
            case MBT -> statsMBT.addStats(gameStats);
            case AA -> statsAA.addStats(gameStats);
            case DRONE -> statsDrone.addStats(gameStats);
            case CHASSEUR -> statsChasseur.addStats(gameStats);
            case BOMBARDIER -> statsBombardier.addStats(gameStats);
            case HELICO -> statsHelico.addStats(gameStats);
        }
    }
}
