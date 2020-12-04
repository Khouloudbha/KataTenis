package dto;

import java.util.List;
import java.util.Objects;

public class Game {

    List<Player> players;
    List<SimplePart> parties;


    public void setPlayers(List<Player> players) {

        this.players = players;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<SimplePart> getParties() {
        return parties;
    }

    public void setParties(List<SimplePart> parties) {
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
