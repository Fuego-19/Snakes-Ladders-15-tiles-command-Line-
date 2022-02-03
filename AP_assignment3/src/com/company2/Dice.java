package com.company2;
import java.util.Random;

public class Dice {
    private int rollValue;

    public void roll(){
        Random rand = new Random();
        rollValue = rand.nextInt(2) + 1;
    }

    public int getValue() {
        return rollValue;
    }
}