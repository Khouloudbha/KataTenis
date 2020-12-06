package service;

import dto.Game;
import dto.Match;
import dto.Player;
import static service.ScoreUtils.isMatchWon;
public class MatchServices {

public Player run(Match match)
{
    for(Game game : match.getGames())
    {
        Player winner = match.getPalyres().stream().filter(player -> player.getId() == game.getWinner()).findAny().get();
        winner.setScoreWinGame(winner.getScoreWinGame()+1);

        if(isMatchWon(match))//get nubre of winner
        {
            return winner;
        }

    }
    return null;
}
}
