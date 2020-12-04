package dto;

import java.util.Objects;

public class Player {

    private int id;
    private String score;

    public String getScore() {
        return score;
    }

    public Player(int id) {
        this.id = id;
        this.score = "0";
    }

    public void setScore(String score) {
        this.score = score;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return id == player.id &&
                Objects.equals(score, player.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, score);
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", score='" + score + '\'' +
                '}';
    }
}
