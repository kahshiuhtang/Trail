package Game.Items.Armours;

import Game.Items.Armour;

public class Leggings implements Armour<Leggings> {
    private final double critReduction, damageReduction, rarity;
    private final boolean equipped;
    private final int storageSpace;

    public Leggings(){
        critReduction = 0.5;
        damageReduction = 4.0;
        equipped = false;
        storageSpace = 3;
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
        return 0;
    }

    @Override
    public Leggings getItem() {
        return new Leggings();
    }
}
