package service;

import dto.Game;
import dto.Match;
import dto.Part;
import dto.Player;

public class ScoreUtils {
// if player have A score the player is win
    public static String onWin(Player player) {

        switch (player.getScore()) {
            case "0":
                return "15";
            case "15":
                return "30";
            case "30":
                return "40";
            case "40":
                 return "A";

        }
        return "0";

    }

    public static String updateScore(Player player)
    {

        switch(player.getScore()){
            case "40" : return "ADV";
            case "ADV"  : return "A";

        }
        return "0";
    }

    public static boolean isTieBreakWon(Match match)
    {
        int scorePlayer1 = match.getPalyres().get(0).getTieBreak();
        int scorePlayer2 = match.getPalyres().get(1).getTieBreak();

            return  scoreDifference(match, 2) && scorePlayer1 == 7 || scorePlayer2 == 7;
    }
    public static boolean isMatchWon(Match match)
    {
        int scorePlayer1 = match.getPalyres().get(0).getScoreWinGame();
        int scorePlayer2 = match.getPalyres().get(1).getScoreWinGame();

        if(scoreDifference(match, 2))
            return scorePlayer1 == 6 || scorePlayer2 == 6;
        else
            return  scorePlayer1 == 7 || scorePlayer2 == 7;
    }

    private static boolean scoreDifference(Match match, int difference) {
        int scorePlayer1 = match.getPalyres().get(0).getScoreWinGame();
        int scorePlayer2 = match.getPalyres().get(1).getScoreWinGame();
        return Math.max(scorePlayer1, scorePlayer2) - Math.min(scorePlayer1, scorePlayer2) >= difference;
    }

}
