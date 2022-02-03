package com.company2;

public class Snake extends Floor{
    private static int PositionVar = -4;
    private static int points = -2;

// Method overriding (POLYMORPHISM)
    public static void updatePosition(Player pl){
        int pos = pl.getPosition() + PositionVar;
        pl.setPosition(pos);
    }
    public static void updatePoints(Player pl){
        int pts = pl.getPoints() + points;
        pl.setPoints(pts);
    }
}
