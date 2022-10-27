package Game.Items.Weapons;

import Game.Items.Weapon;

public class Hammer implements Weapon<Hammer> {
    private final boolean equipped, booster;
    private final int storageSize;
    private final double damageBoost, critChance, boost;
    public Hammer(){
        equipped = false;
        booster = false;
        storageSize = 2;
        damageBoost = 6.0;
        critChance = 0.6;
        boost = 2.0;
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
    public boolean getBooster() {
        return booster;
    }

    @Override
    public double getBoost() {
        return boost;
    }
}
