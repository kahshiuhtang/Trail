package Game.Items.Weapons;
import Game.Items.Weapon;

public class Bow implements Weapon<Bow> {
    private final boolean equipped, booster;
    private final int storageSize;
    private final double damageBoost, critChance, boost, rarity, rangeIncrease;
    public Bow(){
        equipped = false;
        booster = false;
        storageSize = 1;
        damageBoost = 6.0;
        critChance = 0.5;
        boost = 1.2;
        rarity = 0.3;
        rangeIncrease = 0;
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
    public double rarity() {
        return rarity;
    }

    @Override
    public Bow getItem() {
        return new Bow();
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
    @Override
    public double getRangeIncrease() {
        return rangeIncrease;
    }
}
