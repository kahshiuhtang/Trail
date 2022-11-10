package Game.Utilities;

import Structures.Pair;

import java.util.Objects;

public class ComparePoints {
    public static boolean compare(Pair<Integer> one, Pair<Integer>other ){
        return Objects.equals(one.x, other.x) && Objects.equals(one.y, other.y);
    }
}
