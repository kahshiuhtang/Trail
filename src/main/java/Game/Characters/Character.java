package Game.Characters;

import Game.Items.Item;

public interface Character<T>{
    /*
    * How many spaces does the character have in a turn
    * Normal: 3
     */
    public int getMoves();
    /*
     * How much health a character has
     * Normal: 16
     */
    public double getHealth();
    /*
     * How much damage a character does
     */
    public double getAttack();
    /*
     * how many tiles away can the character attack
     */
    public int getRange();
    /*
     * defense is the percent of taking half damage
     */
    public double getDefense();
    /*
     * What items are held by the player:
     * Max storage is different for every player, depends on class
     */
    public Item<?>[] getStorage();


}
