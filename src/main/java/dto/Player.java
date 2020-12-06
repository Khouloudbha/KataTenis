package dto;

import java.util.Objects;

public class Player {

    private int id;
    private String score;
    private int scoreWinGame;
    private  int tieBreak;

    public String getScore() {
        return score;
    }

    public Player(int id) {
        this.id = id;
        this.score = "0";
        this.scoreWinGame = 0;
        this.tieBreak = 0;
    }

    public int getTieBreak() {
        return tieBreak;
    }

    public void setTieBreak(int tieBreak) {
        this.tieBreak = tieBreak;
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

    public int getScoreWinGame() {
        return scoreWinGame;
    }

    public void setScoreWinGame(int scoreWinGame) {
        this.scoreWinGame = scoreWinGame;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return id == player.id &&
                scoreWinGame == player.scoreWinGame &&
                tieBreak == player.tieBreak &&
                Objects.equals(score, player.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, score, scoreWinGame, tieBreak);
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", score='" + score + '\'' +
                ", scoreWinGame=" + scoreWinGame +
                ", tieBreak=" + tieBreak +
                '}';
    }
}
