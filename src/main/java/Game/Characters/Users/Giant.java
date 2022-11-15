package Game.Characters.Users;

import Game.Characters.User;
import Game.Items.Item;
import Game.Utilities.Generator;
import Structures.Pair;

public class Giant implements User {
    private final int moves, range;

    private int x,y;
    private double health, attack, defense, critChance;
    private Item<?>[] storage;

    public Giant(){
        x = Generator.generateRandomNumber(0,15);
        y = Generator.generateRandomNumber(0,15);
        moves = 2;
        health = 32;
        attack = 8;
        range = 2;
        critChance = 0.7;
        defense = 0.8;
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
    @Override
    public void updateCoordinates(int x, int y) {
        this.x = x+this.x;
        this.y = y+this.y;
    }

    @Override
    public void reduceHealth(double damage) {
            this.health = this.health - damage;
    }
    @Override
    public double critChance() {
        return critChance;
    }
}
