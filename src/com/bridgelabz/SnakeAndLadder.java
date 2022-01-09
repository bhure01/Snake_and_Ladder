package com.bridgelabz;

public class SnakeAndLadder {
    int playerInitialPosition = 0;

    private void showPlayerPosition() {        //showing current position
        System.out.println("Player Starting Position = "+ playerInitialPosition);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Gaming program");
        SnakeAndLadder player1 = new SnakeAndLadder();

        player1.showPlayerPosition();     //show player position
    }
}
