package models;

import java.util.Random;

public class Die {
    private int faceValue;
    
    public void roll() {
        Random rand = new Random();

        int random_number = rand.nextInt(6)+1;
        faceValue = random_number;
    }

    public int getFaceValue() {
        return this.faceValue;
    }
}