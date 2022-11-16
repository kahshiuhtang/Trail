package Game.Characters;

import Game.Items.*;

public interface User extends Character<User>{
    /*
     * Gets the weapon that the user is holding or not holding
     */
    public Weapon<?> getWeapon();
    /*
     * Stores however many armour pieces that user may have
     * Maximum of 2
     */
    public Armour<Armour<?>>[] getArmour();
    /*
     * Stores however many boosts a player has
     * No limit on each type of boost
     * Total limit is 2 boosts
     */
    public Boost[] getBoost();
}
