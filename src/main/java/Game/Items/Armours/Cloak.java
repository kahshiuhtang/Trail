package Game.Items.Armours;

import Game.Items.Armour;

public class Cloak implements Armour<Cloak> {
    private final double critReduction, damageReduction;
    private final boolean equipped;
    private final int storageSpace;

    public Cloak(){
        critReduction = 0.7;
        damageReduction = 1.0;
        equipped = false;
        storageSpace = 2;
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
    public Cloak getItem() {
        return new Cloak();
    }
}
