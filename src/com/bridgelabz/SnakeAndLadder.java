package com.bridgelabz;
import java.util.Random;

public class SnakeAndLadder {
    //CONSTANTS
    private static final int NO_PLAY = 0;
    private static final int LADDER = 1;
    private static final int SNAKE = 2;

    //Variables(player position)
    int playerInitialPosition = 0;
    int playerNewPosition = 0;
    int diceCount = 0;
    int diceNo = 0;

    Random randomNumber = new Random();

    private void showPlayerPosition() {        //showing current position
        System.out.println("Player Starting Position = " + playerInitialPosition);
    }

    private int rollDice() {            // roll the dice and get random no.betn 1 to 6
        int diceNo = randomNumber.nextInt(6)+1;
        diceCount++;
        System.out.println("Dice count - " +diceCount);
        return diceNo;
    }

    private void playOption(int diceNo) {         // check options to play
        int optionNo = randomNumber.nextInt(2)+1;
        System.out.println("Option number got " +optionNo);

        switch (optionNo) {
            case NO_PLAY:
                System.out.println("Player got No Play option");
                break;
            case LADDER:
                playerInitialPosition = playerInitialPosition + diceNo;
                System.out.println("WOW! Player got Ladder option");
                if(playerInitialPosition > 100) {    // skip the play if player position crosses 100
                    System.out.println("PLayer position is out of limit");
                    playerInitialPosition -= diceNo;
                }
                break;
            case SNAKE:
                playerInitialPosition = playerInitialPosition + diceNo;
                System.out.println("OOPS! Player Got Snake option");
                if (playerInitialPosition < 0) {
                    playerInitialPosition = 0;
                }
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Gaming program");

        SnakeAndLadder player1 = new SnakeAndLadder();
        SnakeAndLadder player2 = new SnakeAndLadder();

        player1.showPlayerPosition(); //show player1 position
        player2.showPlayerPosition();  // show player2 position

        while (player1.playerInitialPosition != 100 && player2.playerInitialPosition != 100 ) {      // repeat untill player reaches 100 position
            player1.diceNo = player1.rollDice();
            System.out.println("Dice no. for Player 1 is: " +player1.diceNo);

            player1.playOption(player1.diceNo);   // player 1 checks options
            player1.showPlayerPosition();

            player2.diceNo = player2.rollDice();
            System.out.println("Dice no. for Player 2 is: " +player2.diceNo);

            player2.playOption(player2.diceNo);
            player2.showPlayerPosition();

            // check for both players winning possibilities
            if(player1.playerInitialPosition == 100) {
                System.out.println("Player1 win the game");
            } else {
                System.out.println("Player2 win the game");
            }
        }
    }
}


