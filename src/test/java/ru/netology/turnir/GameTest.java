package ru.netology.turnir;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    public void testPlayer1Stronger() {
        Game game = new Game();

        Player player1 = new Player(12, "Fedya", 100);
        Player player2 = new Player(48, "Kolya", 80);

        game.register(player1);
        game.register(player2);

        int actual = game.round("Fedya","Kolya");
        int expected = 1;


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPlayer2Stronger() {
        Game game = new Game();

        Player player1 = new Player(12, "Fedya", 100);
        Player player2 = new Player(48, "Kolya", 800);

        game.register(player1);
        game.register(player2);

        int actual = game.round("Fedya","Kolya");
        int expected = 2;


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPlayersEqual() {
        Game game = new Game();

        Player player1 = new Player(12, "Fedya", 100);
        Player player2 = new Player(48, "Kolya", 100);

        game.register(player1);
        game.register(player2);

        int actual = game.round("Fedya","Kolya");
        int expected = 0;


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPlayer2IsNotRegistred() {
        Game game = new Game();
        Player player1 = new Player(12, "Fedya", 100);
        Player player2 = new Player(48, "Kolya", 80);

        game.register(player1);


        Assertions.assertThrows(NotRegisteredException.class, () -> {
                    game.round("Fedya", "Olya");
                });
    }

    @Test
    public void testBothPlayersIsNotRegistred() {
        Game game = new Game();
        Player player1 = new Player(12, "Fedya", 100);
        Player player2 = new Player(48, "Kolya", 80);


        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Fedya", "Olya");
        });
    }

    @Test
    public void testPlayersFindById() {
        Game game = new Game();

        Player player1 = new Player(12, "Fedya", 100);
        Player player2 = new Player(48, "Kolya", 100);

        game.register(player1);
        game.register(player2);

        int actual = game.round("Fedya","Kolya");
        int expected = 0;


        Assertions.assertEquals(expected, actual);
    }

}