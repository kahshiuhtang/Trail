package Game.Items;

public interface Teleporter extends Item<Teleporter>{
    /*
     * Total Square worth of teleportation
     */
    public int getSquares();
    /*
     * Is this teleportation random?
     */
    public boolean getRandomized();

}
