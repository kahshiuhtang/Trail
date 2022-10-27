package Game.Map;

public interface Square {
    /*
     * How much of a move difference does it give?, rounds down
     */
    public double getWalkSpeed();
    /*
     *  Percentage you take 1 health of damage
     */
    public double getDanger();
}
