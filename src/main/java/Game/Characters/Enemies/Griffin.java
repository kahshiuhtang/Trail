package Game.Characters.Enemies;

import Game.Characters.Enemy;
import Game.Items.Item;

public class Griffin implements Enemy {
    private final int moves, range, vision;
    private final double health, attack, defense, tier, spawnRate;
    public Griffin(){
        moves = 5;
        range = 4;
        health = 16.0;
        attack = 12.0;
        defense = 5.0;
        vision = 3;
        tier = 2;
        spawnRate = 0.35;
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
