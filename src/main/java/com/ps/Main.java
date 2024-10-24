package com.ps;
import java.util.Scanner;
public class Main {
    private static Scanner commandScanner = new Scanner(System.in);

    private static Scanner inputScanner = new Scanner(System.in);

    public static final String PINK = "\033[1;35m";
    public static final String RESET = "\033[0m";
    public static final String CYAN = "\033[1;36m";
    public static final String BRIGHT_RED = "\033[1;91m";

    public static void main(String[] args) {

        String name1, name2;
        //ask players for name
        // name scanner
        System.out.println("Enter first player's name: ");
        name1 = inputScanner.nextLine();

        System.out.println("second player's name: ");
        name2 = inputScanner.nextLine();


        int command = 0;
        Deck deck = new Deck();

        do {
            System.out.println(PINK + "pick your option: " + RESET);
            System.out.println(CYAN + "1. play" + RESET);
            System.out.println(BRIGHT_RED + "2. exit" + RESET);
            System.out.println("command: ");
            command = commandScanner.nextInt();

            switch (command){
                case 1:
                    Card cardOne = deck.deal();
                    Card cardTwo = deck.deal();
                    Hand playerOneHand = new Hand();
                    playerOneHand.deal(cardOne);
                    playerOneHand.deal(cardTwo);
                    Player playerOne = new Player(name1, playerOneHand);
                    // player 2
                    Card cardThree = deck.deal();
                    Card cardFour = deck.deal();
                    Hand playerTwoHand = new Hand();
                    playerTwoHand.deal(cardThree);
                    playerTwoHand.deal(cardFour);
                    Player playerTwo = new Player(name2, playerTwoHand);

                    //
                    System.out.println("player1 cards: ");
                    playerOneHand.displayCards();

                    System.out.println("player2 cards: ");
                    playerTwoHand.displayCards();

                    // we wanna calculate the score we can do int score = getValue();

                    int playerOneScore = playerOneHand.getValue();
                    int playerTwoScore = playerTwoHand.getValue();

                    // if to see who won
                    if(playerOneScore>playerTwoScore)
                        System.out.println(name1 + " won!");
                    else if(playerTwoScore>playerOneScore)
                        System.out.println(name2 + " won!");
                    else System.out.println("DRAW");

                    break;
                case 2:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("not found.");
            }

        } while(command != 2);

        // play
            // deal cards
            // hit or stay
        // Exit
    }

}