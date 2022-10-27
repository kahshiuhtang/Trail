package Game.Items.Weapons;

import Game.Items.Weapon;

public class Sword implements Weapon<Sword> {
    private final boolean equipped, booster;
    private final int storageSize;
    private final double damageBoost, critChance, boost;
    public Sword(){
        equipped = false;
        booster = false;
        storageSize = 1;
        damageBoost = 4.0;
        critChance = 0.3;
        boost = 1.5;
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
    public Weapon getItem() {
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
    public boolean getBooster() {
        return booster;
    }

    @Override
    public double getBoost() {
        return boost;
    }
}
