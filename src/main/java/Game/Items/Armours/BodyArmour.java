package Game.Items.Armours;

import Game.Items.Armour;

public class BodyArmour implements Armour<BodyArmour> {
    private final double critReduction, damageReduction;
    private final boolean equipped;
    private final int storageSpace;

    public BodyArmour(){
        critReduction = 0.5;
        damageReduction = 4.0;
        equipped = false;
        storageSpace = 3;
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
    public BodyArmour getItem() {
        return new BodyArmour();
    }
}
