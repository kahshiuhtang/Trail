package Game.Items.Armours;

import Game.Items.Armour;

public class Cloak implements Armour<Cloak> {
    private final double critReduction, damageReduction, rarity;
    private final boolean equipped;
    private final int storageSpace;

    public Cloak(){
        critReduction = 0.7;
        damageReduction = 1.0;
        equipped = false;
        storageSpace = 2;
        rarity = 0.1;
    }
    @Override
    public double critReduction() {
        return critReduction;
    }

    @Override
    public double damageReduction() {
        return damageReduction;
    }

    @Override
    public boolean getEquipped() {
        return equipped;
    }

    @Override
    public int getStorageSize() {
        return storageSpace;
    }

    @Override
    public double rarity() {
        return rarity;
    }

    @Override
    public Cloak getItem() {
        return new Cloak();
    }
}
