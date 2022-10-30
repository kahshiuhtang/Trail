package Game.Characters.Users;

import Game.Characters.User;
import Game.Items.Item;
    public class Swordsman implements User {

        private final int moves, range;
        private final double health, attack, defense;
        private Item<?>[] storage;

        public Swordsman(){
            moves = 4;
            health = 20;
            attack = 4;
            range = 3;
            defense = 5;
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

