package com.company2;

import java.util.Scanner;


public class Main {

    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Game modes: \n1.Single Player \n2.Against Computer");
        System.out.println("Enter the game Mode(i.e 1 or 2) ");

        int gameMode = scn.nextInt();
        if(gameMode == 1){
            System.out.println("Enter the player name and hit enter.");
            scn.nextLine();
            String player = scn.nextLine();
            System.out.println("The game setup is ready");
            Player player1 = new Player(player);
            PlayGame gameStart = new PlayGame(player1);
        }
        else if (gameMode == 2){
            System.out.println("Enter the player name and hit enter.");
            scn.nextLine();
            String player = scn.nextLine();
            System.out.println("The game setup is ready");
            Player player1 = new Player(player);
            Player bot = new Player("bot");
            PlayGame gameStart = new PlayGame(player1,bot);
        }
        else{
            System.out.println("Wrong input! Game Failed");
        }
    }
}
