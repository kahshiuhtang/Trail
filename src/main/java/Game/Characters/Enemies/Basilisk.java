package Game.Characters.Enemies;

import Game.Characters.Enemy;
import Game.Items.Item;

public class Basilisk implements Enemy {
    private final int moves, range, vision;
    private final double health, attack, defense, tier, spawnRate;
    public Basilisk(){
        moves = 3;
        range = 5;
        health = 20.0;
        attack = 12.0;
        defense = 8.0;
        vision = 3;
        tier = 3;
        spawnRate = 0.2;
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
        return new Item[0];
    }

    @Override
    public double getSpawnRate() {
        return spawnRate;
    }

    @Override
    public double getTier() {
        return tier;
    }

    @Override
    public boolean hasAbility() {
        return false;
    }

    @Override
    public double getVision() {
        return vision;
    }

    @Override
    public Item<? extends Item<?>>[] drops() {
        return new Item[0];
    }
}
