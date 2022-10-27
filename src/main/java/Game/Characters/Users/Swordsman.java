package Game.Characters.Users;

import Game.Characters.User;
import Game.Items.Item;
    public class Swordsman implements User {

        private final int moves, health, attack, range, defense;
        private Item<?>[] storage;

        public Swordsman(){
            moves = 5;
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

