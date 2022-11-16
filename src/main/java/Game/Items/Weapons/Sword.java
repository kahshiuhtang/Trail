package Game.Items.Weapons;

import Game.Items.Weapon;

public class Sword implements Weapon<Sword> {
    private final boolean equipped, booster;
    private final int storageSize;
    private final double damageBoost, critChance, boost, rarity, rangeIncrease;
    public Sword(){
        equipped = false;
        booster = false;
        storageSize = 1;
        damageBoost = 4.0;
        critChance = 0.3;
        boost = 1.5;
        rarity = 0.3;
        rangeIncrease = 1;
    }
    @Override
    public boolean getEquipped() {
        return equipped;
    }

    @Override
    public int getStorageSize() {
        return storageSize;
    }

    @Override
    public Sword getItem() {
        return new Sword();
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
        return 0;
    }
}
