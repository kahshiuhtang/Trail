package Game.Items.Armours;

import Game.Items.Armour;

public class Boots implements Armour<Boots> {
    private final double critReduction, damageReduction, rarity;

    public Boots(){
        critReduction = 0.2;
        damageReduction = 2.0;
        rarity = 0.4;
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
    public double rarity() {
        return rarity;
    }

    @Override
    public Boots getItem() {
        return new Boots();
    }
}
