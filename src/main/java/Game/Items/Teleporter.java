package Game.Items;

public interface Teleporter extends Item<Teleporter>{
    /*
     * Total Square worth of teleportation
     */
    public int getSquaresVertical();
    /*
     * Total Square worth of teleportation
     */
    public int getSquaresHorizontal();
    /*
     * Is this teleportation random?
     */
    public boolean getRandomized();

}
