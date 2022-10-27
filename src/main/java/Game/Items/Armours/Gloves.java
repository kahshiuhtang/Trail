package Game.Items.Armours;

import Game.Items.Armour;

public class Gloves implements Armour<Gloves> {
    private final double critReduction, damageReduction;
    private final boolean equipped;
    private final int storageSpace;

    public Gloves(){
        critReduction = 0.2;
        damageReduction = 1.0;
        equipped = false;
        storageSpace = 1;
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
    public Gloves getItem() {
        return new Gloves();
    }
}
