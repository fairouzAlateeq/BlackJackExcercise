package com.ps;

public class Game {
    private int player1;
    private int player2;

    public Game(int computerScore, int userScore) {
        this.player1= 0;
        this.player2= 0;
    }
    public void incrementScore(String player){
        if(player.equalsIgnoreCase("player1"))
            player1++;
        else if(player.equalsIgnoreCase("player2"))
            player2++;
        else System.out.println("Not a valid player");
    }
    public void displayScore(){
        System.out.printf("player1: %s\nplayer1: %s", player1, player1);
    }
}
