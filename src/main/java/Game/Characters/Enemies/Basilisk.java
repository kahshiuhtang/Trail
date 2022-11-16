package Game.Characters.Enemies;

import Game.Characters.Enemy;
import Game.Items.Armours.Boots;
import Game.Items.*;
import Game.Items.Weapons.Bow;
import Game.Utilities.Generator;
import Structures.Pair;

public class Basilisk implements Enemy {
    private final int moves, range, vision;
    private int x,y;
    private double health, attack, defense, tier, spawnRate, critChance;
    
    private static Weapon<Bow> weaponDrop = new Bow();
    private static Armour<Boots> armourDrop = new Boots();

    public Basilisk(){
        x = Generator.generateRandomNumber(0,15);
        y = Generator.generateRandomNumber(0,15);
        moves = 3;
        range = 5;
        health = 20.0;
        attack = 12.0;
        defense = 0.0;
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
    public Pair<Integer> getCoordinates() {
        return new Pair<Integer>(x,y);
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

    @Override
    public Weapon<?> weaponDrop() {
        return weaponDrop;
    }

    @Override
    public Armour<?> armourDrop() {
        return armourDrop;
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
