package service;

import dto.Game;
import dto.Match;
import dto.Player;

import static service.ScoreUtils.isTieBreakWon;

public class TieBreakMatch {

    public Player run(Match match){
        boolean isTieBreak = false;
        if(isTieBreakMatch(match) == true)
            isTieBreak = true;

        if(isTieBreak)
        {
            for(Game game : match.getGames())
            {
                Player winner = match.getPalyres().stream().filter(player -> player.getId() == game.getWinner()).findAny().get();
                winner.setTieBreak(winner.getTieBreak()+1);

                if(isTieBreakWon(match))
                {
                    return winner;
                }

            }

        }

        return null;
    }


    private boolean isTieBreakMatch(Match match){
        return match.getPalyres().stream().allMatch(player -> player.getScoreWinGame() == 6 );
    }
}
