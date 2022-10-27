package Game.Characters.Enemies;

import Game.Characters.Enemy;
import Game.Items.Item;

public class Basilisk implements Enemy {
    @Override
    public int getMoves() {
        return 0;
    }

    @Override
    public int getHealth() {
        return 0;
    }

    @Override
    public int getAttack() {
        return 0;
    }

    @Override
    public int getRange() {
        return 0;
    }

    @Override
    public int getDefense() {
        return 0;
    }

    @Override
    public Item<?>[] getStorage() {
        return new Item[0];
    }

    @Override
    public double getSpawnRate() {
        return 0;
    }

    @Override
    public double getTier() {
        return 0;
    }

    @Override
    public boolean hasAbility() {
        return false;
    }

    @Override
    public boolean getVision() {
        return false;
    }

    @Override
    public Item<? extends Item<?>>[] drops() {
        return new Item[0];
    }
}
