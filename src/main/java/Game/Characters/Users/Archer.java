package Game.Characters.Users;

import Game.Characters.User;
import Game.Items.Item;
import Game.Utilities.Generator;
import Structures.Pair;

public class Archer implements User {

    private final int moves, range;
    private int x,y;
    private final double health, attack, defense;
    private Item<?>[] storage;

    public Archer(){
        x = Generator.generateRandomNumber(0,15);
        y = Generator.generateRandomNumber(0,15);
        moves = 3;
        health = 16;
        attack = 4;
        range = 6;
        defense = 2;
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

    @Override
    public Pair<Integer> getCoordinates() {
        return new Pair<Integer>(x,y);
    }
}
