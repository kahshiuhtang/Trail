package Game.Utilities;

import java.util.Random;

public class Generator {
    private final static Random r = new Random();
    public static int generateRandomNumber(int lowerBound, int upperBound){
        return r.nextInt((upperBound-lowerBound)+1)+lowerBound;
    }
    public static double generateRandomDecimal(){
        return r.nextDouble();
    }
}
