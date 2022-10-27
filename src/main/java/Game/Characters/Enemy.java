package Game.Characters;

import Game.Items.Item;

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
    * Whether or not the boss has a special ability or not, will be stored as enum
    */
   public boolean hasAbility();
    /*
     * When does the boss start seeing the character
     */
   public boolean getVision();

    public Item<? extends Item<?>>[] drops();

}
