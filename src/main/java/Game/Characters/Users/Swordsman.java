package Game.Characters.Users;

import Game.Characters.User;
import Game.Items.Armour;
import Game.Items.Boost;
import Game.Items.Weapon;
import Game.Utilities.Generator;
import Structures.Pair;

public class Swordsman implements User {

        private final int moves, range;

        private int x,y;
        private double health, attack, defense, critChance;
        private Weapon<?> weapon;
        private Armour<Armour<?>>[] armour;
        private Boost[] boost;

        public Swordsman(){
            x = Generator.generateRandomNumber(0,15);
            y = Generator.generateRandomNumber(0,15);
            moves = 6;
            health = 25;
            attack = 4;
            range = 3;
            critChance = 0.5;
            defense = 0.5;
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
    @Override
    public Weapon<?> getWeapon() {
        return weapon;
    }
    @Override
    public Armour<Armour<?>>[] getArmour() {
        return armour;
    }
    @Override
    public Boost[] getBoost() {
        return boost;
    }
}

