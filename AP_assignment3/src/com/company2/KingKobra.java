package com.company2;

public class KingKobra extends Snake{
    private static int point = -4;
    private static int positionVar = -8;

    // Method overriding
    public static void updatePosition(Player pl){
        int pos = pl.getPosition() + positionVar;
        pl.setPosition(pos);
    }
    public static void updatePoints(Player pl){
        int pts = pl.getPoints() + point;
        pl.setPoints(pts);
    }
}
