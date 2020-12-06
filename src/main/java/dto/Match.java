package dto;

import java.util.List;

public class Match {
    List<Player> palyres;
    List<Game> games;

    public Match(List<Player> palyres) {
        this.palyres = palyres;
    }

    public List<Player> getPalyres() {
        return palyres;
    }

    public void setPalyres(List<Player> palyres) {
        this.palyres = palyres;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}
