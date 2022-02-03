package com.company2;

public class PlayGame {
    private Player P1;
    private Player bot;

    PlayGame(Player P1){
        this.P1 = P1;
        startGameSingle(P1);
    }

    // Method Overloading (POLYMORPHISM) :-
    PlayGame(Player P1, Player bot){
        this.P1 = P1;
        this.bot = bot;
        againstBot();
    }



    public void startGameSingle(Player player){
        if(player.getPlayerName().equals("bot")){
            player.botPlaying();
        }
        else{
            player.playRound();
        }
        if(player.getPosition() == -1){
            if(player.getRoll() != 1){
                System.out.println("Game cannot start until you get 1");
                startGameSingle(player);
            }
            else{
                startGameSingle2(player);
            }
        }
        else{
            startGameSingle2(player);
        }
    }
    private void startGameSingle2(Player player){

        if(player.getPosition() != -1 && !player.getPlayerName().equals("bot")){
            player.playRound();
        }
        if(player.getPosition() != -1 && player.getPlayerName().equals("bot")){
            player.botPlaying();
        }

        if(player.getPosition() + player.getRoll() == 2){
            Elevator.updatePoints(player);
        }
        else if(player.getPosition() + player.getRoll() == 5){
            Snake.updatePoints(player);
        }
        else if(player.getPosition() + player.getRoll() == 8){
            Ladder.updatePoints(player);
        }
        else if(player.getPosition() + player.getRoll()  == 11){
            KingKobra.updatePoints(player);
        }
        else if (player.getPosition() + player.getRoll()  == 13){
            Floor.updatePosition(player);
            Floor.updatePoints(player);
            utilityFunction("an Empty Floor",player);
            System.out.println("Game Over");
            System.out.println(player.getPlayerName() + " accumulated " + player.getPoints() + " points");
            return;
        }
        else if (player.getPosition() + player.getRoll() > 13){
            System.out.println("Player cannot move");
            startGameSingle2(player);
        }
        else{
            Floor.updatePoints(player);
        }


        if(player.getPosition()  == 2){
            Elevator.updatePosition(player);
        }
        else if(player.getPosition()  == 5){
            Snake.updatePosition(player);
        }
        else if(player.getPosition() == 8){
            Ladder.updatePosition(player);
        }
        else if(player.getPosition() == 11){
            KingKobra.updatePosition(player);
        }
        else if (player.getPosition() == 13){
            utilityFunction("an Empty Floor",player);
            System.out.println("Game Over");
            System.out.println(player.getPlayerName() + " accumulated " + player.getPoints() + " points");
            return;
        }
        else{
            Floor.updatePosition(player);
        }

        if(player.getPosition() == 2){
            utilityFunction("an Elevator Floor",player);
            Floor.updatePoints(player);
            Elevator.updatePosition(player);
            utilityFunction("an Empty Floor",player);
            startGameSingle2(player);
        }
        else if(player.getPosition() == 5){
            utilityFunction("a Snake Floor",player);
            Floor.updatePoints(player);
            Snake.updatePosition(player);
            utilityFunction("an Empty Floor",player);
            startGameSingle2(player);
        }
        else if(player.getPosition() == 8){
            utilityFunction("a Ladder Floor",player);
            Floor.updatePoints(player);
            Ladder.updatePosition(player);
            utilityFunction("an Empty Floor",player);
            startGameSingle2(player);
        }
        else if(player.getPosition() == 11){
            utilityFunction("a King Kobra Floor",player);
            Floor.updatePoints(player);
            KingKobra.updatePosition(player);
            utilityFunction("an Empty Floor",player);
            startGameSingle2(player);
        }
        else if (player.getPosition() == 13){
            utilityFunction("an Empty Floor",player);
            System.out.println("Game Over");
            System.out.println(player.getPlayerName() + " accumulated " + player.getPoints() + " points");
            return;
        }
//        else if (player.getPosition() > 13){
//            System.out.println("Player cannot move");
//            startGameSingle2(player);
//        }
        else{
            utilityFunction("an Empty Floor",player);
            startGameSingle2(player);
        }
    }

    private void utilityFunction(String floor, Player player){
        System.out.println("Player position Floor-" + player.getPosition());
        System.out.println(player.getPlayerName() + " has reached " + floor);
        System.out.println("Total points " + player.getPoints());
    }


    // Game against Bot
    private void againstBot(){
        startGameSingle(this.P1);
        int player1_points = P1.getPoints();
        System.out.println("\n\n\nBot is now playing its turn.");
        startGameSingle(bot);
        int bot_points = bot.getPoints();

        System.out.println("\n\nScorecard\n" + this.P1.getPlayerName() + ": " + player1_points + "\nbot: " + bot_points);
        if(player1_points > bot_points){
            System.out.println("\nYou won against the bot ( /^ ▽ ^ )/");
            return;
        }
        else if(player1_points == bot_points){
            System.out.println("\nMatch tied ٩(^ ᴗ ^)۶");
        }
        else{
            System.out.println("You lost to the bot (╥﹏╥) ");
        }
    }
    
}
