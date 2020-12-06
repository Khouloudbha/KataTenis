package service;

import dto.Game;
import dto.Match;
import dto.Player;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TieBreakMatchTest  {

    @Test
    public void player1_should_be_winner_Match(){

        Player player1 = new Player(1);
        Player player2 = new Player(2);

        player1.setScoreWinGame(6);
        player2.setScoreWinGame(6);

        Match match =new  Match(List.of(player1,player2));

        Game game1 = new Game(List.of(player1,player2), 1);
        Game game2 = new Game(List.of(player1,player2), 2);
        Game game3 = new Game(List.of(player1,player2), 1);
        Game game4 = new Game(List.of(player1,player2), 1);
        Game game5 = new Game(List.of(player1,player2), 1);
        Game game6 = new Game(List.of(player1,player2), 1);
        Game game7 = new Game(List.of(player1,player2), 1);
        Game game8 = new Game(List.of(player1,player2), 1);
        Game game9 = new Game(List.of(player1,player2), 1);


        List<Game> games = List.of(game1, game2,  game3, game4, game5, game6, game7, game8, game9);

        match.setGames(games);

        Player winner = new TieBreakMatch().run(match);

        assertEquals(player1.getId(), winner.getId());
    }


    @Test
    public void player2_should_be_winner_Match(){

        Player player1 = new Player(1);
        Player player2 = new Player(2);

        player1.setScoreWinGame(6);
        player2.setScoreWinGame(6);

        Match match =new  Match(List.of(player1,player2));

        Game game1 = new Game(List.of(player1,player2), 2);
        Game game2 = new Game(List.of(player1,player2), 1);
        Game game3 = new Game(List.of(player1,player2), 1);
        Game game4 = new Game(List.of(player1,player2), 1);
        Game game5 = new Game(List.of(player1,player2), 1);
        Game game6 = new Game(List.of(player1,player2), 2);
        Game game7 = new Game(List.of(player1,player2), 2);
        Game game8 = new Game(List.of(player1,player2), 2);
        Game game9 = new Game(List.of(player1,player2), 2);
        Game game10 = new Game(List.of(player1,player2), 2);
        Game game11 = new Game(List.of(player1,player2), 2);



        List<Game> games = List.of(game1, game2,  game3, game4, game5, game6, game7, game8, game9, game10, game11);

        match.setGames(games);

        Player winner = new TieBreakMatch().run(match);

        assertEquals(player2.getId(), winner.getId());
    }
}