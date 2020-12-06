package service;

import dto.Game;
import dto.Part;
import dto.Player;

import static service.ScoreUtils.*;

public class DeuceGameService implements GameService{

 @Override
    public Player run(Game game) {
     boolean deuce;
        for (Part part : game.getParties()) {

                Player winner = game.getPlayers().stream().
                        filter(player -> player.getId() == part.getWinnerId()).findAny().get();
                winner.setScore(updateScore(winner));
                deuce = isDeuce(game);// all the players has the same score
                if (deuce) {
                    game.getPlayers().forEach(player -> player.setScore("40"));
                }
                if (winner.getScore().equals("A")) {
                    return winner;
                }

        }
        return null;
    }

private boolean isDeuce(Game game)
{
    return game.getPlayers().stream().map(player -> player.getScore()).distinct().count() == 1;
}


}
