package Game.Characters.Users;

import Game.Characters.User;
import Game.Items.Item;

public class Giant implements User {
    private final int moves, range;
    private final double health, attack, defense;
    private Item<?>[] storage;

    public Giant(){
        moves = 2;
        health = 32;
        attack = 8;
        range = 2;
        defense = 3;
    }
    @Override
    public int getMoves() {
        return moves;
    }

    @Override
    public double getHealth() {
        return health;
    }

    @Override
    public double getAttack() {
        return attack;
    }

    @Override
    public int getRange() {
        return range;
    }

    @Override
    public double getDefense() {
        return defense;
    }

    @Override
    public Item<?>[] getStorage() {
        return storage;
    }
}
