package com.company2;

public class Player {

    private String playerName;
    private int position = -1;
    private int points;
    private Dice dice = new Dice();

    Player(String name){
        this.playerName = name;
    }

    public void playRound()
    {
        System.out.println("Hit enter to roll the dice");
        Main.scn.nextLine();
        dice.roll();
        System.out.println("Dice gave " + dice.getValue());
    }
    public void botPlaying(){
        System.out.println("\nRolling Dice...");
        dice.roll();
        System.out.println("Dice gave " + dice.getValue());
    }
    public int getRoll(){
        return dice.getValue();
    }
    public int getPosition(){
        return this.position;
    }
    public int getPoints(){
        return this.points;
    }
    public void setPoints(int pts){
        this.points = pts;
    }
    public void setPosition(int pos){
        this.position = pos;
    }
    public String getPlayerName(){
        return this.playerName;
    }

}



