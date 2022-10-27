package Game.Characters.Users;

import Game.Characters.User;
import Game.Items.Item;

public class Giant implements User {
    private final int moves, health, attack, range, defense;
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
    public int getHealth() {
        return health;
    }

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public int getRange() {
        return range;
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public Item<?>[] getStorage() {
        return storage;
    }
}
