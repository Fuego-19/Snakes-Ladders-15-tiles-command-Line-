package com.company2;

public class Ladder extends Floor{

    private static int ladderPos = 4;
    private static int ladderPoints = 2;

    // Method Overriding
    public static void updatePosition(Player pl){
        int pos = pl.getPosition() + ladderPos;
        pl.setPosition(pos);
    }
    public static void updatePoints(Player pl){
        int pts = pl.getPoints() + ladderPoints;
        pl.setPoints(pts);
    }


}
