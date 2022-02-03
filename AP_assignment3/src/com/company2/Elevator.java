package com.company2;

public class Elevator extends Ladder{
    private static int elevatorPositionVar = 8;
    private static int elevatorPoints = 4;

    // Method Overriding
    public static void updatePosition(Player pl){
        int pos = pl.getPosition() + elevatorPositionVar;
        pl.setPosition(pos);
    }
    public static void updatePoints(Player pl){
        int pts = pl.getPoints() + elevatorPoints;
        pl.setPoints(pts);
    }

}
