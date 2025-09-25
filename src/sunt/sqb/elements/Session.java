package sunt.sqb.elements;

import java.util.ArrayList;
import java.util.List;

public class Session {
    private int id;
    private String date;
    private String remplisPar;
    private float br;
    private List<Game> games;
    
    public Session (int id, String date, String remplisPar, float br) {
        this.id = id;
        this.date = date;
        this.remplisPar = remplisPar;
        this.br = br;
        this.games = new ArrayList();
    }

    public void addGame(Game game) {
        this.games.add(game);
    }

    public List<Game> getGames() {
        return games;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getRemplisPar() {
        return remplisPar;
    }

    public float getBr() {
        return br;
    }
}
