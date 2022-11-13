package Game.Utilities;

import Structures.Pair;

import java.util.Objects;

public class ComparePoints {
    public static boolean compare(Pair<Integer> one, Pair<Integer>other ){
        return Objects.equals(one.x, other.x) && Objects.equals(one.y, other.y);
    }
    public static double distance(Pair<Integer> one, Pair<Integer>other ){
        return Math.pow(one.x-other.x,2) + Math.pow(one.y-other.y,2);
    }
}
