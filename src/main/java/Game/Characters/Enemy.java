package Game.Characters;

import Game.Items.Armour;
import Game.Items.Boost;
import Game.Items.Item;
import Game.Items.Weapon;
import Game.Map.Square;

public interface Enemy extends Character<Enemy> {


    /*
     *  Odds of enemy spawning in the biome it is assigned to
     */
   public double getSpawnRate();
   /*
    * Difficulty of the boss (1-5)
    */
   public double getTier();
   /*
    * Whether the boss has a special ability or not, will be stored as enum
    */
   public boolean hasAbility();
    /*
     * When does the boss start seeing the character
     */
   public double getVision();

    public Item<? extends Item<?>>[] drops();

    public Weapon<?> weaponDrop();
    public Armour<?> armourDrop();

}
