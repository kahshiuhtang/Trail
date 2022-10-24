package Game.Characters;

import Game.Items.Item;

public interface Character<T>{

    public int getMoves();
    public int getHealth();

    public int getAttack();

    public int[] getCooldowns();

    public int getDefense();

    public Item<?>[] getStorage();


}
