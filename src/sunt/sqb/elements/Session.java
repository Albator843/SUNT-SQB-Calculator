package sunt.sqb.elements;

import java.util.ArrayList;
import java.util.List;

public class Session {
    private int id;
    private String date;
    private String remplisPar;
    private float br;
    private List<Game> games;
    
    /*
     * Constructeur
     */
    public Session (int id, String date, String remplisPar, float br) {
        this.id = id;
        this.date = date;
        this.remplisPar = remplisPar;
        this.br = br;
        this.games = new ArrayList();
    }

    /*
     * Ajoute une game à la session
     */
    public void addGame(Game game) {
        this.games.add(game);
    }

    /*
     * Retourne la liste des games de la session
     */
    public List<Game> getGames() {
        return games;
    }

    /*
     * Retourne l'ID de la session
     */
    public int getId() {
        return id;
    }

    /*
     * Retourne la date de la session
     */
    public String getDate() {
        return date;
    }

    /*
     * Retourne qui a rempli les infos de la session
     */
    public String getRemplisPar() {
        return remplisPar;
    }

    /*
     * Retourne le BR de la session
     */
    public float getBr() {
        return br;
    }

    /*
     * Retourne un résumé des statistiques de la session avec une indentation donnée, sous forme d'un String.
     */
    public String resumeStatsSession(int indentation) {
        String indent = "  ".repeat(indentation);
        StringBuilder resume = new StringBuilder(indent + "Session ID: " + id + "\n");
        resume.append(indent).append("Date: ").append(date).append("\n");
        resume.append(indent).append("Remplis Par: ").append(remplisPar).append("\n");
        resume.append(indent).append("BR: ").append(br).append("\n");
        resume.append(indent).append("Games:\n");
        for (Game game : games) {
            resume.append(game.resumeStatsGame(indentation + 1));
        }
        return resume.toString();
    }
}
