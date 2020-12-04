package service;

import dto.Game;
import dto.SimplePart;
import dto.Player;

import static service.ScoreUtils.onWin;

public class GameService {

    public Player run(Game game){

            for(SimplePart simplePart : game.getParties()){
            Player winner = game.getPlayers().stream().
                    filter(player -> player.getId() == simplePart.getWinnerId()).findAny().get();
            winner.setScore(onWin(winner));
            if(winner.getScore().equals("A")){
                return winner;
            }
        }
        return null;
    }
}
