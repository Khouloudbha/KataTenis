package service;

import dto.Game;
import dto.SimplePart;
import dto.Player;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GameServiceTest {

    @Test
    public void player1_should_be_winner(){

        Game game = new Game();
        Player player1 = new Player(1);
        Player player2 = new Player(2);

        SimplePart simplePart1 = new SimplePart(1);
        SimplePart simplePart2 = new SimplePart(1);
        SimplePart simplePart3 = new SimplePart(1);
        SimplePart simplePart4 = new SimplePart(1);
        SimplePart simplePart5 = new SimplePart(1);

        List<SimplePart> simplePartList = List.of(simplePart1, simplePart2, simplePart3, simplePart4, simplePart5);
        game.setParties(simplePartList);
        game.setPlayers(List.of(player1, player2));

        Player winner = new GameService().run(game);

        assertEquals(player1.getId(), winner.getId());
    }

    @Test
    public void player2_should_be_winner(){

        Game game = new Game();
        Player player1 = new Player(1);
        Player player2 = new Player(2);

        SimplePart simplePart1 = new SimplePart(1);
        SimplePart simplePart2 = new SimplePart(1);
        SimplePart simplePart3 = new SimplePart(2);
        SimplePart simplePart4 = new SimplePart(1);
        SimplePart simplePart5 = new SimplePart(2);
        SimplePart simplePart6 = new SimplePart(2);
        SimplePart simplePart7 = new SimplePart(2);

        List<SimplePart> simplePartList = List.of(simplePart1, simplePart2, simplePart3, simplePart4, simplePart5, simplePart6, simplePart7);
        game.setParties(simplePartList);
        game.setPlayers(List.of(player1, player2));

        Player winner = new GameService().run(game);

        assertEquals(player2.getId(), winner.getId());
    }

}