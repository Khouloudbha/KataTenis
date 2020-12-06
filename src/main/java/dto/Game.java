package dto;

import java.util.List;
import java.util.Objects;

public class Game {

    List<Player> players;
    List<Part> parties;
    int winner;

    public Game() {
    }


    public Game(List<Player> players, int winner) {
        this.players = players;
        this.winner = winner;
    }

    public int getWinner() {
        return winner;
    }

    public void setWinner(int winner) {
        this.winner = winner;
    }

    public void setPlayers(List<Player> players) {

        this.players = players;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Part> getParties() {
        return parties;
    }

    public void setParties(List<Part> parties) {
        this.parties = parties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Game)) return false;
        Game game = (Game) o;
        return Objects.equals(players, game.players) &&
                Objects.equals(parties, game.parties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(players, parties);
    }
}
