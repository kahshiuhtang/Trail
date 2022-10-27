package Game.Items.Armours;

import Game.Items.Armour;

public class Helmet implements Armour<Helmet> {
    private final double critReduction, damageReduction;
    private final boolean equipped;
    private final int storageSpace;

    public Helmet(){
        critReduction = 0.3;
        damageReduction = 3.0;
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
    public Helmet getItem() {
        return new Helmet();
    }
}
