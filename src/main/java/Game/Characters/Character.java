package Game.Characters;

import Game.Items.Item;
import Structures.Pair;

public interface Character<T>{

    public double critChance();
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
     * Coordinates for where each character is located
     */
    public Pair<Integer> getCoordinates();

    public void updateCoordinates(int x, int y);

    public void reduceHealth(double damage);


}
