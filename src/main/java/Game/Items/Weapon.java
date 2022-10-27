package Game.Items;

public interface Weapon<T> extends Item<T>{
    /*
     * How much damage does this weapon add on top of the
     */
    public double getDamageBoost();
    /*
     * Crit chance out of 100%
     */
    public double getCritChance();
    /*
     * Will have double the stats if certain class is using it.
     */
    public boolean getBooster();
    /*
     * Will have double the stats if certain class is using it.
     */
    public double getBoost();

}
