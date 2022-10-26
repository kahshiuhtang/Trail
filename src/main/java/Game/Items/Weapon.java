package Game.Items;

public interface Weapon extends Item<Weapon>{
    /*
     * How much damage does this weapon add on top of the
     */
    public int getDamageBoost();
    /*
     * Crit chance out of 100%
     */
    public double getCritChance();
    /*
     * Will have double the stats if certain class is using it.
     */
    public boolean getBooster();
    /*
     * Is the user using the item?
     */
    public boolean getEquipped();

}
