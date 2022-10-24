package Game.Utilities;

import java.util.Random;

public class Dice {

    private final Random generator;

    public Dice(){
        generator = new Random();
    }
    public int getDiceRoll(){
        return generator.nextInt(1,7);
    }

}
