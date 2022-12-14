package Game.Characters.Enemies;

import Game.Characters.Enemy;
import Game.Items.*;
import Game.Items.Armours.Gloves;
import Game.Items.Weapon;
import Game.Items.Weapons.Hammer;
import Game.Utilities.Generator;
import Structures.Pair;

public class Werewolf implements Enemy {

    private final int moves, range, vision;
    private int x,y;
    private double health, attack, defense, tier, spawnRate, critChance;
    private static Weapon<Hammer> weaponDrop = new Hammer();
    private static Armour<Gloves> armourDrop = new Gloves();
    public Werewolf(){
        x = Generator.generateRandomNumber(0,15);
        y = Generator.generateRandomNumber(0,15);
        moves = 2;
        range = 5;
        health = 16.0;
        attack = 12.0;
        defense = 8.0;
        vision = 2;
        tier = 1;
        spawnRate = 0.6;
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
