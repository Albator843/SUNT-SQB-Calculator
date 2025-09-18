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

    public void addStats(int nbPoints, int nbKillsAir, int nbKillsSol, int nbAssistances, int nbCaptures, int nbMorts) {
        this.nbGames++;
        this.nbPoints += nbPoints;
        this.nbKillsAir += nbKillsAir;
        this.nbKillsSol += nbKillsSol;
        this.nbAssistances += nbAssistances;
        this.nbCaptures += nbCaptures;
        this.nbMorts += nbMorts;
    }

    public TypeVehicule getTypeVehicule() {
        return typeVehicule;
    }

    public int getNbGames() {
        return nbGames;
    }

    public int getNbPoints() {
        return nbPoints;
    }

    public int getNbKillsAir() {
        return nbKillsAir;
    }

    public int getNbKillsSol() {
        return nbKillsSol;
    }

    public int getNbAssistances() {
        return nbAssistances;
    }

    public int getNbCaptures() {
        return nbCaptures;
    }

    public int getNbMorts() {
        return nbMorts;
    }
}
