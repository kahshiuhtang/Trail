package Game.Characters.Enemies;

import Game.Characters.Enemy;
import Game.Items.*;
import Game.Items.Armours.Cloak;
import Game.Items.Weapons.Hammer;
import Game.Utilities.Generator;
import Structures.Pair;

public class Griffin implements Enemy {
    private final int moves, range, vision;

    private int x,y;
    private double health, attack, defense, tier, spawnRate, critChance;

    private static Weapon<Hammer> weaponDrop = new Hammer();
    private static Armour<Cloak> armourDrop = new Cloak();
    public Griffin(){
        x = Generator.generateRandomNumber(0,15);
        y = Generator.generateRandomNumber(0,15);
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
    public void updateCoordinates(int x, int y) {
        this.x = x+this.x;
        this.y = y+this.y;
    }

    @Override
    public void reduceHealth(double damage) {
        this.health = this.health - damage;
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
    public double critChance() {
        return critChance;
    }
}
