package com.company2;

public class Floor {
    private static int Points = 1;
    private static int positionVar = 1;

    public static void updatePosition(Player pl){
        int pos;
        if(pl.getRoll() == 1) {
            pos = pl.getPosition() + positionVar;
        }
        else{
            pos = pl.getPosition() + positionVar + 1;
        }
        pl.setPosition(pos);
    }
    public static void updatePoints(Player pl){
        int pts = pl.getPoints() + Points;
        pl.setPoints(pts);
    }

}

