package service;

import dto.Game;
import dto.Part;
import dto.Player;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class SimpleGameServiceTest {

    @Test
    public void player1_should_be_winner(){

        Game game = new Game();
        Player player1 = new Player(1);
        Player player2 = new Player(2);

        Part part1 = new Part(1);
        Part part2 = new Part(1);
        Part part3 = new Part(1);
        Part part4 = new Part(1);
        Part part5 = new Part(1);

        List<Part> partList = List.of(part1, part2, part3, part4, part5);
        game.setParties(partList);
        game.setPlayers(List.of(player1, player2));

        Player winner = new SimpleGameService().run(game);

        assertEquals(player1.getId(), winner.getId());
    }

    @Test
    public void player2_should_be_winner(){

        Game game = new Game();
        Player player1 = new Player(1);
        Player player2 = new Player(2);

        Part part1 = new Part(1);
        Part part2 = new Part(1);
        Part part3 = new Part(2);
        Part part4 = new Part(1);
        Part part5 = new Part(2);
        Part part6 = new Part(2);
        Part part7 = new Part(2);

        List<Part> partList = List.of(part1, part2, part3, part4, part5, part6, part7);
        game.setParties(partList);
        game.setPlayers(List.of(player1, player2));

        Player winner = new SimpleGameService().run(game);

        assertEquals(player2.getId(), winner.getId());
    }


}