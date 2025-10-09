package sunt.sqb.elements;

public class TableStatsTypeVehicule {
    private TypeVehicule typeVehicule;
    private int nbGames;
    private int nbPoints;
    private int nbKillsAir;
    private int nbKillsSol;
    private int nbAssistances;
    private int nbCaptures;
    private int nbMorts;

    /*
     * Constructeur
     */
    public TableStatsTypeVehicule(TypeVehicule typeVehicule) {
        this.typeVehicule = typeVehicule;
        this.nbGames = 0;
        this.nbPoints = 0;
        this.nbKillsAir = 0;
        this.nbKillsSol = 0;
        this.nbAssistances = 0;
        this.nbCaptures = 0;
        this.nbMorts = 0;
    }

    /*
     * Ajoute des statistiques
     */
    public void addStats(int nbPoints, int nbKillsAir, int nbKillsSol, int nbAssistances, int nbCaptures, int nbMorts) {
        this.nbGames++;
        this.nbPoints += nbPoints;
        this.nbKillsAir += nbKillsAir;
        this.nbKillsSol += nbKillsSol;
        this.nbAssistances += nbAssistances;
        this.nbCaptures += nbCaptures;
        this.nbMorts += nbMorts;
    }

    /*
     * Ajoute les statistiques d'un autre TableStatsTypeVehicule
     * Les statistiques doivent être du même type de véhicule
     */
    public void addStats(TableStatsTypeVehicule stats) {
        if (this.typeVehicule != stats.typeVehicule) {
            throw new IllegalArgumentException("Cannot add stats of different vehicle types");
        }
        this.nbGames += stats.nbGames;
        this.nbPoints += stats.nbPoints;
        this.nbKillsAir += stats.nbKillsAir;
        this.nbKillsSol += stats.nbKillsSol;
        this.nbAssistances += stats.nbAssistances;
        this.nbCaptures += stats.nbCaptures;
        this.nbMorts += stats.nbMorts;
    }

    /*
     * Retourne le type de véhicule
     */
    public TypeVehicule getTypeVehicule() {
        return typeVehicule;
    }

    /*
     * Retourne le nombre de parties jouées
     */
    public int getNbGames() {
        return nbGames;
    }

    /*
     * Retourne le nombre de points
     */
    public int getNbPoints() {
        return nbPoints;
    }

    /*
     * Retourne le nombre de kills en air
     */
    public int getNbKillsAir() {
        return nbKillsAir;
    }

    /*
     * Retourne le nombre de kills au sol
     */
    public int getNbKillsSol() {
        return nbKillsSol;
    }

    /*
     * Retourne le nombre d'assistances
     */
    public int getNbAssistances() {
        return nbAssistances;
    }

    /*
     * Retourne le nombre de captures
     */
    public int getNbCaptures() {
        return nbCaptures;
    }

    /*
     * Retourne le nombre de morts
     */
    public int getNbMorts() {
        return nbMorts;
    }

    /*
     * Retourne les statistiques sous forme de tableau d'entiers
     * [0] = nbGames
     * [1] = nbPoints
     * [2] = nbKillsAir
     * [3] = nbKillsSol
     * [4] = nbAssistances
     * [5] = nbCaptures
     * [6] = nbMorts
     */
    public int[] getStats() {
        return new int[] {nbGames, nbPoints, nbKillsAir, nbKillsSol, nbAssistances, nbCaptures, nbMorts};
    }

    /*
     * Donne un résumé des stats, sous la forme d'un String
     */
    public String resumeStats(int indentation) {
        String indent = "  ".repeat(indentation);
        String resume = typeVehicule + ":\n";
        resume += indent + "  Parties jouées: " + nbGames + "\n";
        resume += indent + "  Points: " + nbPoints + "\n"; 
        resume += indent + "  Kills Air: " + nbKillsAir + "\n";
        resume += indent + "  Kills Sol: " + nbKillsSol + "\n";
        resume += indent + "  Assistances: " + nbAssistances + "\n";
        resume += indent + "  Captures: " + nbCaptures + "\n";
        resume += indent + "  Morts: " + nbMorts + "\n";
        return resume;
    }

    
}
