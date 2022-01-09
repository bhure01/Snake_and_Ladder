package com.bridgelabz;

public class SnakeAndLadder {
    int playerInitialPosition = 0;

    private void showPlayerPosition() {        //showing current position
        System.out.println("Player Starting Position = " + playerInitialPosition);
    }

    private int rollDice() {            // roll the dice and get random no.betn 1 to 6
        int diceNo = (int) Math.floor((Math.random() * 10) % 6 + 1);
        return diceNo;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Gaming program");
        SnakeAndLadder player1 = new SnakeAndLadder();
        player1.showPlayerPosition(); //show player position
        player1.rollDice();

        System.out.println("Dice no. for Player is: " +player1.rollDice());
    }
}


