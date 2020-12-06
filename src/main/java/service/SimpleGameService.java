package service;

import dto.Game;
import dto.Part;
import dto.Player;

import static service.ScoreUtils.onWin;

public class SimpleGameService  implements GameService{

    @Override
    public Player run(Game game) {

        for (Part part : game.getParties()) {

            Player winner = game.getPlayers().stream().
                    filter(player -> player.getId() == part.getWinnerId()).findAny().get();
            winner.setScore(onWin(winner));
            if (winner.getScore().equals("A")) {
                game.setWinner(winner.getId());
                return winner;
            }
        }
        return null;
    }
}
