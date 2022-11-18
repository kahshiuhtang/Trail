package Game.Items.Weapons;

import Game.Items.Weapon;

public class Hammer implements Weapon<Hammer> {
    private final boolean booster;
    private final double damageBoost, critChance, boost, rarity, rangeIncrease;
    public Hammer(){
        booster = false;
        damageBoost = 6.0;
        critChance = 0.6;
        boost = 2.0;
        rarity = 0.3;
        rangeIncrease = 0;
    }

    @Override
    public Hammer getItem() {
        return new Hammer();
    }

    @Override
    public double getDamageBoost() {
        return damageBoost;
    }

    @Override
    public double getCritChance() {
        return critChance;
    }

    @Override
    public double rarity() {
        return rarity;
    }
    @Override
    public boolean getBooster() {
        return booster;
    }

    @Override
    public double getBoost() {
        return boost;
    }
    @Override
    public double getRangeIncrease() {
        return rangeIncrease;
    }
}
